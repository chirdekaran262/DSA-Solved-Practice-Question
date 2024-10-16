package StackQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue cq = new CustomQueue();
        cq.insert(10);
        cq.insert(13);
        cq.insert(14);
        cq.insert(15);
        cq.insert(16);
        System.out.println(cq.front());
        System.out.println(cq.remove());
        cq.display();

        System.out.println("\n-------------");
        CircularQueue ciq = new CircularQueue(6);
        ciq.insert(10);
        ciq.insert(12);
        ciq.insert(14);
        ciq.insert(15);
        ciq.insert(16);

        System.out.println(ciq.remove());
        System.out.println(ciq.remove());
        System.out.println(ciq.front());
        System.out.println(ciq.front());
        ciq.display();

        System.out.println("\n-------------");
        DyanamicQueue dq = new DyanamicQueue();
        dq.insert(19);
        dq.insert(12);
        dq.insert(14);
        dq.insert(15);
        dq.insert(11);
        dq.display();

    }
}
