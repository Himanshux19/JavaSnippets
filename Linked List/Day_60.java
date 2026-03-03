// Day 60 : Common elements of two linked lists (by value)

import java.util.*;

public class Day_60 {

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
        if (head == null)
            return newNode;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

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

    public static void printCommonElements(Node head1, Node head2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> printed = new HashSet<>();
        Node temp = head1;
        while (temp != null) {
            set.add(temp.data);
            temp = temp.next;
        }
        temp = head2;
        System.out.print("Common elements are: ");
        while (temp != null) {
            if (set.contains(temp.data) && !printed.contains(temp.data)) {
                System.out.print(temp.data + " ");
                printed.add(temp.data);
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Linked List 1: ");
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++)
            head1 = insert(head1, sc.nextInt());
        System.out.print("Enter size of Linked List 2: ");
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++)
            head2 = insert(head2, sc.nextInt());
        System.out.println("\nLinked List 1:");
        display(head1);
        System.out.println("Linked List 2:");
        display(head2);
        printCommonElements(head1, head2);
        sc.close();
    }
}