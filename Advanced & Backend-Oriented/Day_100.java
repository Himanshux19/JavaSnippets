// Day 100 : Producer–Consumer (wait/notify)

import java.util.LinkedList;
import java.util.Queue;

public class Day_100 {

    static class SharedBuffer {
        private Queue<Integer> queue = new LinkedList<>();
        private int capacity;

        public SharedBuffer(int capacity) {
            this.capacity = capacity;
        }

        public synchronized void produce(int value) throws InterruptedException {
            while (queue.size() == capacity) {
                wait();
            }

            queue.add(value);
            System.out.println("Produced: " + value);

            notifyAll();
        }

        public synchronized int consume() throws InterruptedException {
            while (queue.isEmpty()) {
                wait();
            }

            int value = queue.poll();
            System.out.println("Consumed: " + value);

            notifyAll();
            return value;
        }
    }

    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(5);

        Thread producer = new Thread(() -> {
            int value = 0;
            try {
                while (true) {
                    buffer.produce(value++);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    buffer.consume();
                    Thread.sleep(800);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}