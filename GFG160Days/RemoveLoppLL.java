public class RemoveLoppLL {
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static void removeLoop(Node head) {
        // code here
       Node slow=head;
        Node fast=head;
        slow=slow.next;
        fast=fast.next.next;
        
        while(fast.next!=null && fast.next.next!=null){
            if(slow==fast){
                break;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        
        if(slow==fast){
            slow=head;
            if(slow!=fast){
                while(slow.next!=fast.next){
                    slow=slow.next;
                    fast=fast.next;
                }
                fast.next=null;
            }
            else{
                while(fast.next!=slow){
                    fast=fast.next;
                }
                fast.next=null;
            }
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next; // Creating a loop

        removeLoop(head);
        
        // Print the list to verify loop removal
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
