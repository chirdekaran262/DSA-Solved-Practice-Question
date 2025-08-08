class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}


class DiameterOfTree {
    static int diameterres(Node root,int[] res){
        if(root==null){
            return 0;
        }
        int lHeight=diameterres(root.left,res);
        int rHeight=diameterres(root.right,res);
        res[0]=Math.max(res[0],lHeight+rHeight);
        return 1+ Math.max(lHeight,rHeight);
    }
    static int diameter(Node root) {
        // Your code here
        int[] res=new int[1];
        diameterres(root,res);
        return res[0];
    }

   public static void main(String[] args) {
       Node root = new Node(5);
        root.left = new Node(8);
        root.right = new Node(6);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(9);

        System.out.println(diameter(root));
   }
}