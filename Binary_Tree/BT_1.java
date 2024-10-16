package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

import Linked_List.linked_list;

class BT_1 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data);
            preorder(root.left);
            preorder(root.right);
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currnode = q.remove();

                if (currnode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.println(currnode.data + " ");
                    if (currnode.left != null) {
                        q.add(currnode.left);
                    }
                    if (currnode.right != null) {
                        q.add(currnode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 2, 4, 7, -1, 5, -5, 6, 3, -2, 1, 6, 3, 2, 2, 4, 2 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
        System.out.println("\nPreorder of the tree is:");
        tree.preorder(root);
        System.out.println("Inorder of the tree is:");
        tree.inorder(root);
        System.out.println("Postorder of the tree is:");
        tree.preorder(root);
    }
}