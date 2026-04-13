
class Node {
    int data;
    Node next;
}

class RemoveLoop {
    public static void removeLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                slow = head;
                while (fast != slow) {
                    slow = slow.next;
                    fast = fast.next;
                }
                Node temp = slow;
                while (temp.next != slow) {
                    temp = temp.next;
                }
                temp.next = null;

            }

        }
    }
    public static void main(String[] args) {
        RemoveLoop list = new RemoveLoop();
        Node head = new Node();
        head.data = 1;
        head.next = new Node();
        head.next.data = 2;
        head.next.next = new Node();
        head.next.next.data = 3;
        head.next.next.next = new Node();
        head.next.next.next.data = 4;
        head.next.next.next.next = new Node();
        head.next.next.next.next.data = 5;

        // Creating a loop for testing
        head.next.next.next.next.next = head;

        list.removeLoop(head);

        // Printing the list after removing the loop
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}