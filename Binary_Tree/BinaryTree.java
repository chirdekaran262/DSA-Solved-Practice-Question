import java.util.Scanner;

public class BinaryTree {
    public class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    public static Node root;
    public void populate(Scanner sc){
        System.out.println("Enter the root value: ");
        int val=sc.nextInt();
        root=new Node(val);
        populate(sc,root);
    }
    private void populate(Scanner sc,Node node){
        System.out.println("Do you want Enter the node left to the "+node.val);
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("Enter the Value : ");
            int val=sc.nextInt();
            node.left=new Node(val);
            populate(sc,node.left);
        }
        System.out.println("Do you want Enter the node right to the "+node.val);
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("Enter the Value : ");
            int val=sc.nextInt();
            node.right=new Node(val);
            populate(sc,node.right);
        }
    }
    public void display(){
        display(root,"");
    }
    private void display(Node node,String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.val);
        display(node.left,"\t");
        display(node.right,"\t");
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinaryTree bt=new BinaryTree();
        bt.populate(sc);
        bt.display();
    }
}
