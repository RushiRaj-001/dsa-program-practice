package BinaryTree;

public class SumTree {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int dat) {
            data = dat;
            this.left = this.right = null;
        }
    }

    public static int transform(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = transform(root.left);
        int rightSum = transform(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftSum + newRight + rightSum;

        return data;
    } 

    public static void preOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(7);

        preOrder(root);
        System.out.println();
        transform(root);
        System.out.println();
        preOrder(root);
    }
}
