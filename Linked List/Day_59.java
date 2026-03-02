// Day 59 : Check palindrome linked list

import java.util.*;

public class Day_59 {
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

    public static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private static Node middleNode() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private static boolean palindrome(Node head, Node mid) {
        while (mid != null) {
            if (mid.data != head.data)
                return false;
            mid = mid.next;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day_59 list = new Day_59();
        System.out.print("Enter the Size of Linked List : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Node : ");
            int x = sc.nextInt();
            list.insert(x);
        }
        System.out.print("Linked List : ");
        list.display();
        Node mid = middleNode();
        Node secondHalf = reverseList(mid);
        System.out.print(palindrome(head, secondHalf) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}