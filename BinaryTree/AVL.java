public class AVL {
    public class Node {
        private int val;
        private Node left;
        private Node right;
        private int height;

        public Node(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }
    }

    public AVL() {

    }

    private Node root;

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean treeisEmpty() {
        return root == null;
    }

    // public void display(Node node,String detials){
    // if(node==null){
    // return;
    // }
    // System.out.println(detials+node.getVal());
    // display(node.left, "Left Child of Node "+node.getVal()+":");
    // display(node.right, "Right Child of Node "+node.getVal()+":");
    // }
    public void insert(int val) {
        root = insert(root, val);
    }

    private Node insert(Node node, int val) {
        if (node == null) {
            node = new Node(val);
            return node;
        }
        if (val < node.val) {
            node.left = insert(node.left, val);
        }
        if (val > node.val) {
            node.right = insert(node.right, val);
        }
        node.height = Math.max(height(node.left), height(node.left)) + 1;
        return rotate(node);
    }

    private Node rotate(Node node) {
        if ((height(node.left) - height(node.right) > 1)) {
            // left heavy
            if ((height(node.left.left) - height(node.left.right) > 0)) {
                // left left case
                return rightRotate(node);
            }
            if ((height(node.left.left) - height(node.left.right) < 0)) {
                // left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if ((height(node.left) - height(node.right) < 0)) {
            // right heavy
            if ((height(node.right.left) - height(node.right.right) < 0)) {
                // right right case
                return rightRotate(node);
            }
            if ((height(node.right.left) - height(node.right.right) > 0)) {
                // right left case
                node.left = rightRotate(node.left);
                return leftRotate(node);
            }
        }

        return node;
    }

    public Node rightRotate(Node p) {
        Node c = p.right;
        Node t = c.left;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        return c;
    }

    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        return p;
    }

    public void populate(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    // public void sortedPopulated(int[] nums){
    // return sortedPopulated(nums,0,nums.length);
    // }
    // private void sortedPopulated(int nums[],int start,int end){
    // if(start>=end){
    // return;
    // }
    // int mid=start+(end-start)/2;
    // this.insert(nums[mid]);
    // sortedPopulated(nums,start,mid);
    // sortedPopulated(nums,mid+1,end);
    // }
    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) - 1 <= 1 && isBalanced(node.left)
                && isBalanced(node.right);
    }

    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String detials) {
        if (node == null) {
            return;
        }
        System.out.println(detials + node.val);
        display(node.left, node.val + " Left Child of " + " : ");
        display(node.right, node.val + " Right Child of " + " :  ");
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }
}