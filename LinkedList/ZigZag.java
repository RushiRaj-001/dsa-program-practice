package LinkedList;


public class ZigZag {

   

    public static void main(String[] args) {

        LinkedList ll1 = new LinkedList();
        ll1.addFirst(6);
        ll1.addFirst(5);
        ll1.addFirst(4);
        ll1.addFirst(3);
        ll1.addFirst(2);
        ll1.addFirst(1);
        ll1.print();

        ll1.zigzag();

        ll1.print();
    }

}