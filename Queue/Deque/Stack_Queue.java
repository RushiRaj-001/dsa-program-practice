import java.util.Deque;
import java.util.LinkedList;


public class Stack_Queue{
   static class Stack{
        static Deque<Integer> q = new LinkedList<>();

        static void push(int data){
            q.addLast(data);
        }

        static int pop(){
            return q.removeLast();
        }

        static int peek(){
            return q.getLast();
        }
    }    

    static class Queue{
        static Deque<Integer> q2 = new LinkedList<>();

        static void add(int data){
            q2.addLast(data);
        }

        static int remove(){
            return q2.removeFirst();
        }

        static int peek(){
            return q2.getFirst();
        }
    }
    public static void main(String[] args){
        // Stack s = new Stack();

        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.push(4);

        // System.out.println(s.peek());
        // s.pop();
        // s.pop();
        // System.out.println(s.peek());

        Queue q = new Queue();
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.peek());
        q.remove();
        q.remove();
        
    }
}