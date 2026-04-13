

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} 

class KthFromEnd {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        int count=0;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        if(count+1<k){
            return -1;
        }
        int n=count+1-k;
        temp=head;
        for(int i=0;i<n;i++){
            temp=temp.next;
        }
        return temp.data;
        
    }
    public static void main(String[] args) {
        KthFromEnd list = new KthFromEnd();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 2;
        int result = list.getKthFromLast(head, k);
        System.out.println("The " + k + "th node from the end is: " + result);
    }
}