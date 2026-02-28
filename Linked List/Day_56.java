// Day 56 : Detect cycle (Floyd)

import java.util.*;

public class Day_56 {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day_56 list = new Day_56();
        System.out.print("Enter the Size of Linked List : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Node : ");
            int x = sc.nextInt();
            list.insert(x);
        }
        System.out.print(hasCycle(head) ? "Cycle Found" : "No Cycle Found");
        sc.close();
    }

    public static boolean hasCycle(Node head) {
        if (head == null)
            return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}