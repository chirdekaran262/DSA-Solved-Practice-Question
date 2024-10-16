import java.util.Deque;
import java.util.LinkedList;

import QueueLL.queue;

public class Deque_ {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.addLast(50);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
        System.out.println("First Element "+deque.getFirst());
        System.out.println("Last Element "+deque.getLast());
    }
}
