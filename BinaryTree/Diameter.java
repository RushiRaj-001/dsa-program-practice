package BinaryTree;

public class Diameter {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    // Time complexity O(N^2)
    public static int diameter(Node root) {

        if (root == null) {
            return 0;
        }

        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);

        int self = lh + rh + 1;

        int diam = (lh > rh) ? lh : rh;

        return Math.max(diam, self);
    }

    static class Info {
        int diam;
        int ht;

        Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter2(Node root) {

        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter2(root.left);
        Info rigtInfo = diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rigtInfo.diam), leftInfo.ht + rigtInfo.ht + 1);
        int ht = Math.max(rigtInfo.diam, leftInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);

        System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);
        System.out.println(diameter2(root).ht);
    }
}
