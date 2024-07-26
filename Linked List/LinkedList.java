public class LinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node convertll(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static int lengthll(Node head) {
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    static boolean searchll(Node head, int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        Node head = convertll(arr);
        // System.out.println(head.data);
        System.out.println(lengthll(head));
        System.out.println(searchll(head, 5));

    }
} 