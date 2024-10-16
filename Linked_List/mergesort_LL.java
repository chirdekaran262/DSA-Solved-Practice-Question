package Linked_List;

public class mergesort_LL {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public static Node head;
    public static Node tail;

    public Node findmid(){
        Node slow=head;
        Node fast=head;
        if(head==null || head.next==null){
            return head;
        }

        while(fast.next!=null &&  fast!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1,Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;

        while(head1!=null || head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }

    public Node mergesort(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node mid=findmid();
        Node righthead=mid.next;
        mid.next=null;
        Node newleft=mergesort(head);
        Node newright=mergesort(righthead);
        return merge(newleft,newright);
    }

    public static void main(String[] args) {
            mergesort_LL ll=new mergesort_LL();
            Node head=new Node(20);
            Node n1=new Node(30);
            Node n2=new Node(10);
            Node n3=new Node(40);
            Node n4=new Node(50);
            head.next=n1;
            n1.next=n2;
            n2.next=n3;
            n3.next=n4;
            Node n=head;
            while(n!=null){
            System.out.print(n.data);
            n=n.next;
            }
            head=ll.mergesort(head);
            while(n!=null){
            System.out.print(n.data);
            n=n.next;
            }
    }
}
