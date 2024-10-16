
import java.util.Arrays;

class BST{
    public class Node{
        int val;
        Node left;
        Node right;
        int height;
        public Node(int val){
            this.val=val;
        }
        public int getValue(){
            return val;
        }
    }
    public static Node root;
    public boolean isEmpty(){
        return root==null;
    }


    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }


    public void insert(int val){
        root=insert(val,root);
    }
    private Node insert(int val,Node node){
        if(node==null){
            node=new Node(val);
            return node;
        }
        if(val<node.val){
            node.left=insert(val, node.left);
        }
        if(val>node.val){
            node.right=insert(val, node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    public boolean isBalanced(){
        return isBalanced(root);
    }
    private boolean isBalanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && isBalanced(node.left) &&isBalanced(node.right);
    }

    public void display(){
        display(root,"Root Node");
    }
    private void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.val);
        display(node.left,"Left Child of "+node.val+": ");
        display(node.right,"Right Child of "+node.val+": ");
    }

    public void populate(int a[]){
        for(int i=0;i<a.length;i++){
            insert(a[i]);
        }
    }
    public void Sortedpopulate(int a[]){
        Sortedpopulate(a,0,a.length);
    }
    private void Sortedpopulate(int a[],int start,int end){
        int mid=(end+start)/2;
        if(start>=end){
            return;
        }
        insert(a[mid]);
        Sortedpopulate(a,start,mid);
        Sortedpopulate(a,mid+1,end);
    }
    public static void main(String[] args) {
        int a[]={3,1,8,6,2,7,8,4,9,10};
        BST b=new BST();
        Arrays.sort(a);
        b.Sortedpopulate(a);
        b.display();
        System.out.println(b.height(root.left));
        System.out.println(b.findHeight(7));
    }

    public int findHeight(int val){
        return findHeight(root,val);
    }
    private int findHeight(Node node,int val){
        if(node==null){
            return 0;
        }
        if(node.val==val){
            return node.height;
        }
        if(node.val<val){
            node=node.left;
            node.height=height(node.left)+1;
        }
        if(node.val>val){
            node=node.right;
            node.height=height(node.right)+1;
        }
        return node.height;
    }

}