import java.util.*;

public class Day_75 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        if (root == null)
            return al;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                level.add(curr.data);
                if (curr.left != null)
                    q.offer(curr.left);
                if (curr.right != null)
                    q.offer(curr.right);
            }
            al.add(level);
        }
        return al;
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
        ArrayList<ArrayList<Integer>> result = levelOrder(root);
        System.out.println(result);
    }
}