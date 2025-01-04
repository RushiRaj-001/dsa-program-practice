package LinkedList;

import Recursion.reverseArr;

public class DoublyLL {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = null;
        head = newNode;
    }

    int removeFirst() {

        if (head == null) {
            System.out.println("DLL is Empty.");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    int removeLast() {
        if (head == null) {
            System.out.println("DLL is Empty.");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = tail.data;
            size--;
            head = tail = null;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        DoublyLL dll = new DoublyLL();

        // dll.head = new Node(2);
        // dll.head.next = new Node(3);
        // dll.head.next.next = new Node(3);

        dll.addLast(4);
        dll.addLast(5);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(0);

        // dll.removeFirst();
        // dll.removeLast();
        dll.print();
        System.out.println( );
        dll.reverse();
        dll.print();
    }
}
