package Linked_List;

public class linked_1 {
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

    public static void main(String[] args) {
        linked_1 l1=new linked_1();
        l1.head=new Node(2);
        l1.head.next=new Node(3);
        l1.head.next.next=new Node(6);
        l1.head.next.next.next=null;
    }
}
