
class Node {
    int data;
    Node next, random;
    
    Node(int x) {
        data = x;
        next = random = null;
    }
}

class ClonedLL {

    static Node cloneLinkedList(Node head) {
        if (head == null) {
            return null;
        }
        
        // Create new nodes and insert them next to the original nodes
        Node curr = head;
        while (curr != null) {
            Node newNode = new Node(curr.data);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }
        
         
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        
         
        curr = head;
        Node clonedHead = head.next;
        Node clone = clonedHead;
        while (clone.next != null) {
             
            curr.next = curr.next.next;
            clone.next = clone.next.next;
            
           
            curr = curr.next;
            clone = clone.next;
        }
        curr.next = null;
        clone.next = null;
        
        return clonedHead;
    }
    
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + "(");
            if (head.random != null) {
                System.out.print(head.random.data);
            } else {
                System.out.print("null");
            }
            System.out.print(")");
            
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
      	
        // Creating a linked list with random pointer
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head.next;
        
         System.out.println("Original linked list:");
        printList(head);
        
        // Function call
        Node clonedList = cloneLinkedList(head);
        
        System.out.println("Cloned linked list:");
        printList(clonedList);
    }
}