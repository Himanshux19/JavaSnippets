// Day 61 : Stack implementation using array

import java.util.*;

public class StackArray {

    static int stack[];
    static int top = -1;
    static int size;

    static void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = x;
            System.out.println(x + " pushed into stack");
        }
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " popped from stack");
            top--;
        }
    }

    static void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    static void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        size = sc.nextInt();
        stack = new int[size];
        while (true) {
            System.out.println("\n1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    int x = sc.nextInt();
                    push(x);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    display();
                    break;
                case 5: {
                    sc.close();
                    System.exit(0);
                }
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}