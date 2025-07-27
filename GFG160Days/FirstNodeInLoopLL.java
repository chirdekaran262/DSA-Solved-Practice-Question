class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class FirstNodeInLoopLL {
    public static Node findFirstNode(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                slow = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return new Node(-1);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next; // Creating a loop

        Node firstNodeInLoop = findFirstNode(head);
        if (firstNodeInLoop.data != -1) {
            System.out.println("First node in loop: " + firstNodeInLoop.data);
        } else {
            System.out.println("No loop detected");
        }
    }
}