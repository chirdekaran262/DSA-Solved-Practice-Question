package Linked_List;
import java.util.LinkedList;

public class Framework_LL {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();

        ll.addFirst(1);
        ll.addLast(2);
        ll.add(1, 3);
        System.out.println("Linked List: "+ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.print("Linked List: "+ll);
    }
}
