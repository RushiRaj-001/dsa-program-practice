package BST;

public class Mirror {
    static class Node {
        int data;
        Node left, right = null;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }

        Node leftS = mirror(root.left);
        Node rightS = mirror(root.right);

        root.left = rightS;
        root.right = leftS;

        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        /*
         * 8
         * / \
         * 5 10
         * / \ \
         * 3 6 11
         */

        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);

        preOrder(root);
        root = mirror(root);
        System.out.println();
        preOrder(root);
    }
}
