// Day 53 : Delete a node

import java.util.*;

public class Day_53 {
    static Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void delete(int x) {
        if (head == null)
            return;

        if (head.data == x) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == x) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day_53 list = new Day_53();
        System.out.print("Enter the Size of Linked List : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Node : ");
            int x = sc.nextInt();
            list.insert(x);
        }
        System.out.print("Enter node value to delete : ");
        int del = sc.nextInt();
        delete(del);
        System.out.print("Linked List : ");
        list.display();
        sc.close();
    }
}