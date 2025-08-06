import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class LevelOrder {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int len = q.size();
            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < len; i++) {
                Node node = q.poll();
                level.add(node.data);

                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            res.add(level);
        }
        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        LevelOrder levelOrder = new LevelOrder();
        ArrayList<ArrayList<Integer>> result = levelOrder.levelOrder(root);

        for (ArrayList<Integer> level : result) {
            System.out.println(level);
        }
    }
}