public class bt {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.left = null;
            this.right = null;
            this.val = val;
        }
    }

    Node root; // Declaring root as a class-level variable

    void buildtree() {
        root = new Node(10); // Assigning value to the class-level variable
        Node n11 = new Node(12);
        Node n12 = new Node(22);
        Node n13 = new Node(4);
        Node n1 = new Node(11);
        Node n2 = new Node(18);
        Node n3 = new Node(9);

        root.left = n13;
        n13.left = n3; // Change: Setting the left child of n13 to n3 directly
        n13.right = null;
        n3.left = null;
        n3.right = null;
        root.right = n11;
        n11.left = n1;
        n1.left = null;
        n1.right = null;
        n11.right = n2;
        n2.right = n12;
        n12.left = null;
        n12.right = null;
    }

    int leftLeafSum(Node root) {
        if (root == null) {
            return 0;
        }

        // If the current node is a leaf node and is on the left side, return its value
        if (root.left == null && root.right == null) {
            return root.val;
        }

        // Recursively traverse both left and right subtrees
        int leftSum = leftLeafSum(root.left);
        int rightSum = leftLeafSum(root.right);

        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        bt b = new bt();
        b.buildtree();
        int leftLeafSum = b.leftLeafSum(b.root);
        System.out.println("Sum of values of left leaves in the tree: " + leftLeafSum);
    }
}
