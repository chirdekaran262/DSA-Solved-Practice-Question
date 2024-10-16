package Binary_Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BT_2 {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }

    public static int diameter1(Node root){
        if(root==null){
            return 0;
        }

        int ld=diameter1(root.left);
        int lh=height(root.left);
        int rd=diameter1(root.right);
        int rh=height(root.right);

        int selfheight=lh+rh;
        return Math.max(selfheight,Math.max(ld,rd));
    }

    public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root==null){
                return ;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root==null){
                return ;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
            
        }

        public static void levelOrder(Node root){
            if(root==null){
                return ;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currnode= q.remove();

                if(currnode==null){
                    System.out.println( );
                    if(q.isEmpty()){
                        break ;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currnode.data+" ");
                    if(currnode.left!=null){
                        q.add(currnode.left);
                    }
                    if(currnode.right!=null){
                        q.add(currnode.right);
                    }
                }
            }

        }
        
        public static int count(Node root){
            if(root==null){
                return 0;
            }
            int leftcount= count(root.left);
            int rightcount= count(root.right);
            return leftcount+rightcount+1;
        }

        static class Info{
            int diam;
            int ht;
            Info(int diam,int ht){
                this.diam=diam;
                this.ht=ht;
            }
        }

        public static Info diameter(Node root){
            if(root==null){
                return null;
            }

            Info leftinfo=diameter(root.left);
            Info rightinfo=diameter(root.right);

            int diam=Math.max(Math.max(leftinfo.diam,rightinfo.diam),leftinfo.ht+rightinfo.ht);
            int ht=Math.max(leftinfo.ht,rightinfo.ht)+1;
            return new Info(diam,ht);
        }

        public static boolean isIdentical(Node node,Node subroot){
            if(node==null || subroot==null){
                return true;
            }
            else if(node==null || subroot==null || node.data!=subroot.data){
                return false;
            }
            if(!isIdentical(node.left, subroot.left)){
                return false;
            }
            if(!isIdentical(node.right, subroot.right)){
                return false;
            }
            return true;
        }

        public static boolean isSubtree(Node root,Node subroot){
            if(root==null){
                return false;
            }

            if(root.data==subroot.data){
                if(isIdentical(root,subroot)){
                    return true;
                }
            }

            return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
        }

        public static class Info1{
            int hd;
            Node node;
            public Info1(int hd,Node node){
                this.node=node;
                this.hd=hd;
            }
        }

        public static void topView(Node root){
            Queue<Info1> q=new LinkedList<>();
            HashMap<Integer,Node> map=new HashMap<>();
            int min=0,max=0;
            q.add(new Info1(0, root));
            q.add(null);

            while (!q.isEmpty()) {
                Info1  curr=q.remove();
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                if(curr.node.left!=null){
                    q.add(new Info1(curr.hd-1,curr.node.left));
                    min=Math.min(min, curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new Info1(curr.hd+1,curr.node.right));
                    max=Math.max(max, curr.hd+1);
                }
            }
            for(int i=min;i<=max;i++){
                System.out.print(map.get(i).data+" ");
            }
            System.out.println( );
        }

    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(4);
        root.right=new Node(9);
        root.left.left=new Node(7);
        root.left.right=new Node(12);
        root.right.left=new Node(18);
        root.right.right=new Node(17);
        root.right.left.left=new Node(8);
        root.right.left.left.left=new Node(10);

        System.out.println(height(root));


        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
        System.out.println("\nPreorder of the tree is:");
        preorder(root);
        System.out.println("\nInorder of the tree is:");
        inorder(root);
        System.out.println("\nPostorder of the tree is:");
        postorder(root);

        System.out.println("\nLevel of th e tree: \n");
        levelOrder(root);

        System.out.println("Count of the Node is: "+count(root));

     System.out.println("Diameter of the tree is: "+diameter(root));

        
        Node subroot=new Node(4);
        subroot.left=new Node(7);
        subroot.right=new Node(12);
        levelOrder(subroot);
        System.out.println("It is sub tree: "+isSubtree(root,subroot));

        topView(root);
        }
}
