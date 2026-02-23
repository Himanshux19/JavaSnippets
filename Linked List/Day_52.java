// Day 52 : Insert at beginning & end

import java.util.*;

public class Day_52 {
    static Node head;

    public static class Node {
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

    public static void insertBeg(int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
    }

    public static void insertEnd(int x) {
        Node newNode = new Node(x);
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day_52 list = new Day_52();
        System.out.print("Enter the Size of Linked List : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Node : ");
            int x = sc.nextInt();
            list.insert(x);
        }
        System.out.print("Enter node to insert at begining : ");
        int beg = sc.nextInt();
        insertBeg(beg);
        System.out.print("Enter node to insert at begining : ");
        int end = sc.nextInt();
        insertEnd(end);
        System.out.print("Linked List : ");
        list.display();
        sc.close();
    }
}