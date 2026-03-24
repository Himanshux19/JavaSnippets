// Day 78 : Check balanced binary tree

import java.util.*;

public class Day_78 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static boolean isBalanced(Node root) {
        return height(root) != -1;
    }

    public static int height(Node root) {
        if (root == null)
            return 0;
        int left = height(root.left);
        if (left == -1)
            return -1;
        int right = height(root.right);
        if (right == -1)
            return -1;
        if (Math.abs(left - right) > 1)
            return -1;
        return Math.max(left, right) + 1;
    }

    public static Node buildTree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter node value (-1 for NULL): ");
        int val = sc.nextInt();
        if (val == -1)
            return null;
        Node root = new Node(val);
        System.out.println("Enter left child of " + val);
        root.left = buildTree();
        System.out.println("Enter right child of " + val);
        root.right = buildTree();
        return root;
    }

    public static void main(String[] args) {
        Node root = buildTree();
        isBalanced(root);
        System.out.println(isBalanced(root) ? "Is Balanced" : "Not Balanced");
    }
}