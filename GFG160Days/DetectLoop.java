class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class DetectLoop {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next; // Creating a loop

        if (detectLoop(head)) {
            System.out.println("Loop detected");
        } else {
            System.out.println("No loop detected");
        }
    }
}