class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 

class HeightOfTree {
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here
        if(node==null){
            return -1;
        }
        int leftheight=height(node.left);
        int rightheight=height(node.right);
        
        return Math.max(leftheight,rightheight)+1;
    }
    public static void main(String[] args) {
         // Representation of the input tree:
        //     12
        //    /  \
        //   8   18
        //  / \
        // 5   11
        Node root = new Node(12);
        root.left = new Node(8);
        root.right = new Node(18);
        root.left.left = new Node(5);
        root.left.right = new Node(11);
        HeightOfTree h=new HeightOfTree();
        System.out.println(h.height(root));
    
    }
}