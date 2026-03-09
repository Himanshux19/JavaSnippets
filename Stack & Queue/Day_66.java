// Day 66 : Queue using array

public class Day_66 {

    static class QueueArray {

        int[] arr;
        int front;
        int rear;
        int size;

        QueueArray(int size) {
            this.size = size;
            arr = new int[size];
            front = -1;
            rear = -1;
        }

        void enqueue(int x) {
            if (rear == size - 1) {
                System.out.println("Queue Overflow");
                return;
            }

            if (front == -1)
                front = 0;

            rear++;
            arr[rear] = x;
        }

        int dequeue() {
            if (front == -1 || front > rear) {
                System.out.println("Queue Underflow");
                return -1;
            }

            int val = arr[front];
            front++;
            return val;
        }

        int peek() {
            if (front == -1 || front > rear)
                return -1;

            return arr[front];
        }

        void display() {
            if (front == -1 || front > rear) {
                System.out.println("Queue Empty");
                return;
            }

            for (int i = front; i <= rear; i++)
                System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        System.out.println();
        System.out.println("Removed: " + q.dequeue());
        q.display();
    }
}