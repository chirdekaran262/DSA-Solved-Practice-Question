class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class MergeLinkedList {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        
        if(head1.data<=head2.data){
            head1.next=sortedMerge(head1.next,head2);
            return head1;
        }
        else{
            head2.next=sortedMerge(head1,head2.next);
            return head2;
        }
    }
    public static void main(String[] args) {
        // Example usage
        MergeLinkedList mll = new MergeLinkedList();
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        Node mergedHead = mll.sortedMerge(head1, head2);
        
        // Print merged linked list
        Node current = mergedHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}