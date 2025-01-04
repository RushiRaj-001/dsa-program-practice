package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree {

        static int idx = 0;

        public static Node buildTree(int nodes[]) {

            if (idx >= nodes.length) {
                return null;
            }
            if (nodes[idx] == -1) {
                idx++;
                return null;
            }

            Node newNode = new Node(nodes[idx++]);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preOrder(Node root) {
            if (root == null) {
                // System.out.print("-1" + " ");
                return;
            }

            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root) {

            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();

            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }

            int lh = height(root.left);
            int rh = height(root.right);

            int height = Math.max(lh, rh) + 1;

            return height;
        }

        public static int count(Node root) {
            if (root == null) {
                return 0;
            }

            int lh = count(root.left);
            int rh = count(root.right);
            int count = lh + rh + 1;

            return count;
        }

        public static int sum(Node root) {
            if (root == null) {
                return 0;
            }

            int lh = sum(root.left);
            int rh = sum(root.right);

            return lh + rh + root.data;
        }
    }

    public static void main(String[] args) {

        int[] nodes = { 1, 3, 4, -1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        // Index index = new Index();
        Node root = tree.buildTree(nodes);

        // System.out.println(root.data);

        // tree.preOrder(root);
        // System.out.print("\n");
        // tree.inOrder(root);
        // System.out.print("\n");
        // tree.postOrder(root);
        // System.out.println();
        tree.levelOrder(root);

        int height = tree.height(root);
        // System.out.println(height);
        // System.out.println(tree.count(root));
        System.out.println(tree.sum(root));
    }

}
