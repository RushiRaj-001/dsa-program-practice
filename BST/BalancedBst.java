package BST;

public class BalancedBst {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node createBst(int arr[], int st, int end) {
        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;

        Node root = new Node(arr[mid]);

        root.left = createBst(arr, st, mid - 1);

        root.right = createBst(arr, mid + 1, end);

        return root;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 8, 10, 11, 12 };

        Node root = createBst(arr, 0, arr.length - 1);
        preOrder(root);
    }
}
