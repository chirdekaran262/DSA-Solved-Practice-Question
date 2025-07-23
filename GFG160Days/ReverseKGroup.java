
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // code here
        if (head == null || k <= 1) {
            return head;
        }
        Node curr = head;
        Node prev = null;
        Node next = null;

        int cnt = 0;
        Node temp = head;

        while (temp != null && cnt < k) {
            temp = temp.next;
            cnt++;

        }
        if (cnt > 0) {
            curr = head;
            cnt = 0;
            while (curr != null && cnt < k) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                cnt++;

            }
            if (next != null) {
                head.next = reverseKGroup(next, k);
            }
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int k = 2;
        head = reverseKGroup(head, k);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}