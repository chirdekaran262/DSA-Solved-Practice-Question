import java.util.ArrayList;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class PalindromeInLL {
    public boolean isPalindrome(Node head) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        Node temp=head;
        if(head==null){
            return false;
        }
        while(temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }
        int start = 0;
        int end = list.size() - 1;

        // Check palindrome
        while (start < end) {
            if (!list.get(start).equals(list.get(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeInLL list = new PalindromeInLL();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        boolean result = list.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + result);
    }
}
