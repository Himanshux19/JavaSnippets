// Day 57 : Remove Cycle

import java.util.*;

public class Day_57 {
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

    public void createCycle(int pos) {
        if (head == null)
            return;

        Node temp = head;
        Node cycleNode = null;
        int count = 1;

        while (temp.next != null) {
            if (count == pos)
                cycleNode = temp;
            temp = temp.next;
            count++;
        }
        temp.next = cycleNode;
    }

    private static void removeCycle() {
        if (head == null || head.next == null)
            return;

        Node slow = head;
        Node fast = head;
        boolean hasCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle)
            return;

        slow = head;
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day_57 list = new Day_57();

        System.out.print("Enter the Size of Linked List : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Node : ");
            int x = sc.nextInt();
            list.insert(x);
        }
        removeCycle();
        System.out.println("Linked List after removing cycle:");
        list.display();
        sc.close();
    }
}