import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Deque_SQ {
    // public static class Stack{
    //     Deque<Integer> d=new LinkedList<>();
    //     public void push(int data){
    //         d.addLast(data);
    //     }
    //     public int pop(){
    //        return d.removeLast();
    //     }
    //     public int peek(){
    //         return d.getLast();
    //     }
    // }
    
    public static class Queue{
        Deque d1=new LinkedList<>();
        public void add(int data){
            d1.addLast(data);
        }
        public int remove(){
            return d1.removeFirst();
        }
        public void peek(){
           System.out.println(d1.getFirst()); 
        }
    }
    public static void main(String[] args) {
        // Stack s=new Stack();
        // System.out.println("Stack");
        // s.push(10);
        // s.push(20);
        // s.push(30);
        // System.out.println("Element At peek "+s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        Queue qq=new Queue();
        System.out.println("Queue using Deque");
        qq.add(10);
        qq.add(20);
        qq.add(30);
        qq.peek();
        System.out.println(qq.remove());
        
    }
}
