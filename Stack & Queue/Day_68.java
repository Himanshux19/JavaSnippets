// Day 68 : Circular Queue using Array

public class Day_68 {

    static class CircularQueue {
        int[] arr;
        int front;
        int rear;
        int size;
        int capacity;

        CircularQueue(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        void enqueue(int x) {
            if (size == capacity) {
                System.out.println("Queue Overflow");
                return;
            }
            rear = (rear + 1) % capacity;
            arr[rear] = x;
            size++;
        }

        int dequeue() {
            if (size == 0) {
                System.out.println("Queue Underflow");
                return -1;
            }
            int removed = arr[front];
            front = (front + 1) % capacity;
            size--;
            return removed;
        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue Empty");
                return -1;
            }
            return arr[front];
        }

        void display() {
            if (size == 0) {
                System.out.println("Queue Empty");
                return;
            }
            for (int i = 0; i < size; i++)
                System.out.print(arr[(front + i) % capacity] + " ");
        }
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
        System.out.println();
        System.out.println("Removed: " + q.dequeue());
        q.display();
        System.out.println();
        q.enqueue(50);
        q.enqueue(60);
        q.display();
    }
}