package Linked_List;

public class at_last {
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
    public static int size;

    public void add_last(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            tail.next=null;
            size++;
            return;
        }
        tail.next=newnode;
        size++;
        tail=newnode;
        tail.next=null;
    }

    

    public static void add_mid(int data,int pos){
        Node newnode=new Node(data);
        Node pre=head;
        Node temp=head.next;
        int i=1;
        while(i<pos){
            pre=pre.next;
            temp=temp.next;
            i++;
        }
        pre.next=newnode;
        size++;
        newnode.next=temp;
    }

    public int helper(int s,Node head){
        if(head==null){
            return -1;
        }
        if(head.data==s){
            return 0;
        }
        int idx=helper(s, head.next);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    public int recsearch(int s){
        return helper( s, head);
    }

    public static void display(){
        Node n=head;
        if(head==null){
            System.out.println("Empty");
            return;
        }
        while(n!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
        System.out.print("null");
    }

    public void reverse(){
       Node next;
       Node curr=head=tail;
       Node prev=null;

       while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
       }
       head=prev;
    }
    
    public Node mid(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public boolean palindrome(){
        if(head==null || head.next==null){
            return true;
        }

        Node midnode=mid();
        Node prev=null;
        Node curr=midnode;
        Node next;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public boolean cycle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public void deleteCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        slow=head;
        Node prev=null;
        while(slow!=fast){
            slow=slow.next;
            prev=fast;
            fast=fast.next;
        }
        prev.next=null;
    }

    public static void main(String[] args) {
        at_last l1=new at_last();
        l1.display();
        l1.add_last(10);
        l1.add_last(20);
        l1.add_last(30);
        l1.add_last(40);
        l1.add_last(50);
        l1.add_last(60);
        l1.add_last(70);
        l1.display();
        l1.add_mid(80,3);
        System.out.println("\nLinked List");
        l1.display();
        System.out.println("\nSize of the Linked List is: "+l1.size);
        System.out.println(l1.recsearch(56));
        System.out.println(l1.recsearch(50));
        System.out.println("Revrese the Linked List: ");
        //l1.reverse();
        l1.display();
        System.out.println("\nMiddle Element of Linked List is: "+l1.mid().data);
        System.out.println("Linked List Is palindrome is: "+l1.palindrome());
        System.out.println("Cyacle Present In the Linked List: "+l1.cycle());
        tail.next=head;
        System.out.println("Cyacle Present In the Linked List: "+l1.cycle());
        l1.deleteCycle();
        System.out.println("Cyacle Present In the Linked List: "+l1.cycle());

    }
}
