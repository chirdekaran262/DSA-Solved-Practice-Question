
class ReverseLinkedList {
    static class Node {
    int data;
    Node next;
    Node(int value) {
        this.data = value;
    }
}
    Node reverseList(Node head) {
        // code here
        Node prev=null;
        Node curr=head;
        
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public static void main(String[] args) {
        // Example usage
        ReverseLinkedList rll = new ReverseLinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Node reversedHead = rll.reverseList(head);
        
        // Print reversed linked list
        Node current = reversedHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}