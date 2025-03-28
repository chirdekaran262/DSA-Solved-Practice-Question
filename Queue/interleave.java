import java.util.LinkedList;
import java.util.Queue;

public class interleave {
    public  void interleaveF(Queue<Integer> q){
        int size=q.size();
        Queue<Integer> firsthalf=new LinkedList<>();
        for(int i=0;i<size/2;i++){
            firsthalf.add(q.remove());
        }
        while (!firsthalf.isEmpty()) {
            q.add(firsthalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        interleave l=new interleave();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        l.interleaveF(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
}
