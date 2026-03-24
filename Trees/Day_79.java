// Day 79 : Lowest Common Ancestor (BST)

import java.util.*;

public class Day_79 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        while (root != null) {
            if (p.data < root.data && q.data < root.data)
                root = root.left;
            else if (p.data > root.data && q.data > root.data)
                root = root.right;
            else
                return root;
        }
        return null;
    }

    public static Node find(Node root, int val) {
        if (root == null)
            return null;
        if (root.data == val)
            return root;

        if (val < root.data)
            return find(root.left, val);
        else
            return find(root.right, val);
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

        System.out.print("Enter p: ");
        int pVal = sc.nextInt();

        System.out.print("Enter q: ");
        int qVal = sc.nextInt();

        Node p = find(root, pVal);
        Node q = find(root, qVal);

        Node lca = lowestCommonAncestor(root, p, q);

        if (lca != null)
            System.out.println("LCA: " + lca.data);
        else
            System.out.println("LCA not found");
    }
}