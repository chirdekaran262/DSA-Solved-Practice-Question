public class Binary_Tree {

    public class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public Node root;

    public void add(Node node, int val) {
        Node newNode = new Node(val);

        if (root == null) {
            root = newNode;
        } else {
            if (val < node.val) {
                if (node.left != null) {
                    add(node.left, val);
                } else {
                    node.left = newNode;
                }
            } else {
                if (node.right != null) {
                    add(node.right, val);
                } else {
                    node.right = newNode;
                }
            }
        }
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(" " + root.val);
        inorder(root.right);
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(" " + root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(" " + root.val);

    }

    public static void main(String[] args) {
        Binary_Tree b = new Binary_Tree();
        Node root = new Node(0);
        b.add(root, 3);
        b.add(root, 5);
        b.add(root, 1);
        b.add(root, 7);
        b.add(root, 9);
        b.add(root, 2);
        b.add(root, 4);
        System.out.println("Preorder: ");
        b.preorder(root);
        System.out.println("Inorder: ");
        b.inorder(root);
        System.out.println("Postorder: ");
        b.postorder(root);
    }
}