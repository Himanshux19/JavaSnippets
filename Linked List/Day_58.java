// Day 58 : Merge two sorted lists

import java.util.*;

public class Day_58 {
    static Node head1;
    static Node head2;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node merge(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 != null)
            tail.next = l1;
        if (l2 != null)
            tail.next = l2;
        return dummy.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Linked List1 : ");
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            int x = sc.nextInt();
            head1 = insert(head1, x);
        }

        System.out.print("Enter the Size of Linked List2 : ");
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            int x = sc.nextInt();
            head2 = insert(head2, x);
        }

        Node mergedHead = merge(head1, head2);

        System.out.print("Merge of two Linked List is : ");
        display(mergedHead);

        sc.close();
    }
}