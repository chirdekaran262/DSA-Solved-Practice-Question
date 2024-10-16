package Linked_List;

public class linked_list {
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

    public void addNode(int data){
        Node newnode=new Node(data);
        if(head==null){
            tail=newnode;
            head=newnode;
            head.next=null;
            size++;
            return;
        }
        newnode.next=head;
        size++;
        head=newnode;
    }

    public int delete(){
        if(head==null){
            System.out.print("Linked List Is Empty!");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node n=head;
        for(int i=0;i<size-2;i++){
            n=n.next;
        }
        int val=n.next.data;
        size--;
        n.next=null;
        tail=n;

        return val;
    }
    public void Itrsearch(int s){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==s){
                System.out.println(s+" Element found in Linked list position at "+i);
                return;
            }
            i++;
            temp=temp.next;
        }
        System.out.print("Element not found in Linked List");
    }

    public void displaynode(){
        Node n=head;
        if(head==null){
            System.out.println("Linked List Is Empty!");
            return;
        }
        while(n!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
        System.out.print("null\n");
    }

    public void search(int key){
        Node temp=head;
        int i=0;
        while(temp.data!=key){
            temp=temp.next;
            i++;
        }
        System.out.println(key+" Elment found at Index "+i);
    }

    public void deleteSpecific(int d){
        Node deleteNode=head;
        Node pre=head;
        if(head==null){
            return;
        }
        while(deleteNode.next.data!=d){
            deleteNode=deleteNode.next;
            pre=pre.next;
            }
            size--;
            deleteNode=deleteNode.next;
            pre.next=deleteNode.next;
            deleteNode.next=null;
    }
    public static void main(String[] args) {
        linked_list l1=new linked_list();
        l1.displaynode();
        l1.addNode(15);
        l1.addNode(17);
        l1.addNode(34);
        l1.addNode(56);
        l1.addNode(67);
        int val=l1.delete();
        System.out.println("Deleted Node "+val);
        l1.addNode(80);
        l1.addNode(89);
        System.out.print("Linked List Element:   ");
        l1.displaynode();
        l1.deleteSpecific(80);
        System.out.println("Linked List Element after deleting  80");
        l1.displaynode();
        System.out.println("Size of the node is: "+size);
        l1.search(34);
        l1.Itrsearch(50);
    }
}
