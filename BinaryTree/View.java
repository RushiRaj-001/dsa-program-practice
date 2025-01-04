package BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import BinaryTree.Tree.Node;

public class View {
    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    static void top_view(Node root) {
        HashMap<Integer, Node> map = new HashMap<>();

        Queue<Info> q = new LinkedList<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(curr.hd - 1, min);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(curr.hd + 1, max);
                }
            }

        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(6);

        top_view(root);
    }
}
