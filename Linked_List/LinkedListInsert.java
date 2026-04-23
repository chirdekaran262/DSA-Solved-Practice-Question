

class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

class LinkedListInsert {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node newNode=new Node(x);
        if(head==null){
            return newNode;
        }
       
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
    public static void main(String[] args) {
        LinkedListInsert list = new LinkedListInsert();
        Node head = null;
        head = list.insertAtEnd(head, 1);
        head = list.insertAtEnd(head, 2);
        head = list.insertAtEnd(head, 3);
        head = list.insertAtEnd(head, 4);
        head = list.insertAtEnd(head, 5);

        // Printing the list after inserting elements
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
