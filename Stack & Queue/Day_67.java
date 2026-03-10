// Day 67 : Queue using Stack

import java.util.Stack;

public class Day_67 {
    static class QueueStack {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        void enqueue(int x) {
            s1.push(x);
        }

        int dequeue() {
            if (s1.isEmpty() && s2.isEmpty()) {
                System.out.println("Queue Underflow");
                return -1;
            }
            if (s2.isEmpty()) {
                while (!s1.isEmpty())
                    s2.push(s1.pop());
            }
            return s2.pop();
        }

        int peek() {
            if (s1.isEmpty() && s2.isEmpty()) {
                System.out.println("Queue Empty");
                return -1;
            }
            if (s2.isEmpty()) {
                while (!s1.isEmpty())
                    s2.push(s1.pop());
            }
            return s2.peek();
        }

        void display() {
            if (s1.isEmpty() && s2.isEmpty()) {
                System.out.println("Queue Empty");
                return;
            }
            if (s2.isEmpty()) {
                while (!s1.isEmpty())
                    s2.push(s1.pop());
            }
            for (int i = s2.size() - 1; i >= 0; i--)
                System.out.print(s2.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        QueueStack q = new QueueStack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        System.out.println();
        System.out.println("Removed: " + q.dequeue());
        q.display();
    }
}