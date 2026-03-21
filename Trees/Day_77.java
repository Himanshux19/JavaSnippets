import java.util.*;

import javax.swing.tree.TreeNode;

public class Day_77 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static int diameter = 0;

    public static int diameter(Node root) {
        height(root);
        return diameter;
    }

    public static int height(Node root) {
        if (root == null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        diameter = Math.max(left + right, diameter);
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
        diameter(root);
        System.out.println("Diameter of the Tree is : " + diameter);
    }
}