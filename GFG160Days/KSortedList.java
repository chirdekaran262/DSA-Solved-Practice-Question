// Java program to merge K sorted linked lists
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class KSortedList {
    
    // Function to get node with minimum value
    static Node getMinNode(List<Node> arr) {
        Node mini = null;
        int index = -1;
        
        for (int i = 0; i < arr.size(); i++) {
            
            // If current list is processed
            if (arr.get(i) == null) continue;
            
            // If min node is not set or 
            // current head has smaller value.
            if (mini == null || arr.get(i).data < mini.data) {
                index = i;
                mini = arr.get(i);
            }
        }
        
        // Increment the head node 
        if (index != -1) arr.set(index, arr.get(index).next);
        
        return mini;
    }
    
    // Function to merge K sorted linked lists
    static Node mergeKLists(List<Node> arr) {
        Node dummy = new Node(-1);
        Node tail = dummy;
    
        Node mini = getMinNode(arr);
        
        // Process all nodes.
        while (mini != null) {
            
            // Append min node to the result.
            tail.next = mini;
            tail = mini;
            
            // Find the next min node 
            mini = getMinNode(arr);
        }
    
        return dummy.next;
    }
    
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    public static void main(String[] args) {
        List<Node> arr = new ArrayList<>();
        arr.add(new Node(1));
        arr.get(0).next = new Node(3);
        arr.get(0).next.next = new Node(5);
        arr.get(0).next.next.next = new Node(7);
    
        arr.add(new Node(2));
        arr.get(1).next = new Node(4);
        arr.get(1).next.next = new Node(6);
        arr.get(1).next.next.next = new Node(8);
    
        arr.add(new Node(0));
        arr.get(2).next = new Node(9);
        arr.get(2).next.next = new Node(10);
        arr.get(2).next.next.next = new Node(11);
    
        Node head = mergeKLists(arr);
        printList(head);
    }
}