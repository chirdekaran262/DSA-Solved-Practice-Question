import java.util.Scanner;

public class QueueLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isempty() {
            if (head == null && tail == null) {
                return true;
            }
            return false;
        }

        public static void add(int data) {
            Node NewNode = new Node(data);
            if (head == null) {
                tail = head = NewNode;
                return;
            }
            head.next = NewNode;
            head = NewNode;
        }

        public static void remove() {
            if (isempty()) {
                System.out.println("Queue is empty");
                return;
            } else if (tail == head) {
                System.out.print(tail.data + " Remove element");
                tail = head = null;
            } else {
                System.out.print(tail.data + " Remove element");
                tail = tail.next;
            }
        }

        public static void show() {
            if (isempty()) {
                System.out.println("Queue is empty\n");
                return;
            } else {
                Node temp = tail;
                System.out.println("Queue element is: ");
                while (temp != null) {
                    System.out.println("\n" + temp.data + " ");
                    temp = temp.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        queue q = new queue();
        q.add(12);
        q.add(13);
        q.add(14);

        q.show();
        while (q.isempty() != true) {
            q.remove();
        }

    }
}
