public class DLL {
    public class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void show() {
        Node temp = head;
        ;
        if (temp == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null\n");
    }

    public void remove() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        if (head.next == null) {
            System.out.println(head.data + " is remove from Linked List");
            head = null;
            return;
        }
        System.out.println(head.data + " is remove from Linked List");
        head = head.next;
        head.prev = null;
    }

    public static void main(String[] args) {
        DLL ll1 = new DLL();

        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.show();
        ll1.remove();
        ll1.add(40);
        ll1.show();
        ;
    }
}
