// Day 71 : Binary Tree creation

public class Day_71 {
    static class Node {
        int data;
        Node right, left;

        Node(int data) {
            this.data = data;
            right = left = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        System.out.println("Binary Tree Created");
    }
}