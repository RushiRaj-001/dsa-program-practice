package BinaryTree;

import java.util.ArrayList;

import BinaryTree.SubTree.Node;

public class LowestCommonAncestor {

    static Boolean getPath(Node root, int n, ArrayList<Node> path) {

        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean foundRight = getPath(root.right, n, path);
        boolean foundLeft = getPath(root.left, n, path);

        if (foundLeft || foundRight) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;
        for (; i < path1.size() & i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        Node lca = path1.get(i - 1);
        return lca;
    }

    public static Node lca2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if (leftLca == null) {
            return rightLca;
        }
        if (rightLca == null) {
            return leftLca;
        }
        return root;
    }

    public static int dist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int left = dist(root.left, n);
        int right = dist(root.right, n);

        if (left == -1 && right == -1) {
            return -1;
        } else if (left == -1) {
            return right + 1;
        } else {
            return left + 1;
        }
    }

    public static int minDist(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        int rightDist = dist(lca, n1);
        int leftDist = dist(lca, n2);

        return leftDist + rightDist;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(7);

        // System.out.println(lca(root, 6, 7).data);
        // System.out.println(lca2(root, 6, 7).data);

        System.out.println(minDist(root, 6, 7));
    }
}