// Day 80 : Kth smallest element in BST

import java.util.*;

public class Day_80 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int count = 0;
    static int result = -1;

    public static int kthSmallest(Node root, int k) {
        inorder(root, k);
        return result;
    }

    private static void inorder(Node root, int k) {
        if (root == null)
            return;
        inorder(root.left, k);
        count++;
        if (count == k) {
            result = root.data;
            return;
        }
        inorder(root.right, k);
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Build BST (use -1 for null):");
        Node root = buildTree();
        System.out.println("Enter k : ");
        int k = sc.nextInt();
        int kth = kthSmallest(root, k);
        System.out.println("Kth Node is " + kth);
    }
}