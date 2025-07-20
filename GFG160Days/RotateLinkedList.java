class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
} 

class RotateLinkedList {
    public Node rotate(Node head, int k) {
         
        if(k==0||head==null){
            return head;
        }
        
        Node curr=head;
        int len=1;
        while(curr.next!=null){
            curr=curr.next;
            len+=1;
        }
        k%=len;

        if(k==0){
            return head;
        }
        
        curr.next=head;
        curr=head;
        for(int i=1;i<k;i++){
            curr=curr.next;
        }
        head=curr.next;
        curr.next=null;
       
        return head;
    }
    public static void main(String[] args) {
        // Example usage
        RotateLinkedList rll = new RotateLinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 2; // Rotate by 2 nodes
        Node rotatedHead = rll.rotate(head, k);
        
        // Print rotated linked list
        Node current = rotatedHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}