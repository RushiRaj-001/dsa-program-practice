package BST;

import java.util.ArrayList;

public class BuildBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // left subtreee of bst
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static boolean search(Node root, int key) { // O(H)
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }

    }

    // Delete a Node in BST
    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);

        } else if (root.data > val) {
            root.left = delete(root.left, val);
        }

        else {
            // case 1 : leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 : single leaf Node
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 : both leaf Node
            Node IS = findIS(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findIS(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Print in Range
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    // Print path root to leaf

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    public static void printRoot2Path(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }

        printRoot2Path(root.left, path);
        printRoot2Path(root.right, path);

        path.remove(path.size() - 1);
    }

    public static boolean validBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }

        if (min != null && min.data >= root.data) {
            return false;
        } else if (max != null && max.data <= root.data) {
            return false;
        }

        return validBST(root.left, min, root) && validBST(root.right, root, max);
    }

    public static void main(String[] args) {
        int[] values = { 8, 5, 3, 6, 10, 11, 14 };

        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        // inorder(root);
        // delete(root, 1);
        // System.out.println();
        // inorder(root);
        System.out.println();
        // System.out.println(search(root, 10));
        // printInRange(root, 4, 12);

        // printRoot2Path(root, new ArrayList<>());

        System.out.println(validBST(root, null, null));
    }
}
