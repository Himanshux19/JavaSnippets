// Day 72 : Inorder traversal

import java.util.Scanner;

public class Day_72 {
    static class Node {
        int data;
        Node right, left;

        Node(int data) {
            this.data = data;
            right = left = null;
        }
    }

    public static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
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
        System.out.println("Build the Binary Tree");
        Node root = buildTree();
        inorder(root);
    }
}