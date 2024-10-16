import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class queue_2 {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(12);
        q.add(13);
        q.add(14);

        System.out.println("Queue Element is: ");
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
