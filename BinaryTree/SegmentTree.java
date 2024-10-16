public class SegmentTree {
    public class Node {
        int val;
        int startInterval;
        int EndInterval;
        Node left;
        Node right;

        public Node(int startInterval, int EndInterval) {
            this.EndInterval = EndInterval;
            this.startInterval = startInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr) {
        this.root = ConstructTree(arr, 0, arr.length - 1);
    }

    public Node ConstructTree(int[] arr, int start, int end) {
        if (start == end) {
            // leaf Node
            Node leaf = new Node(start, end);
            leaf.val = arr[start];
            return leaf;
        }
        // create new node with indexyou are at
        Node node = new Node(start, end);
        int mid = (start + end) / 2;
        node.left = this.ConstructTree(arr, start, mid);
        node.right = this.ConstructTree(arr, mid + 1, end);
        node.val = node.left.val + node.right.val;
        return node;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        String str = "";
        if (node.left != null) {
            str = str + "Interval =[" + node.left.startInterval + "-" + node.left.EndInterval + "] and Data: "
                    + node.left.val + "=>";
        } else {
            str = str + "No Left Data";
        }
        str = str + "Interval =[" + node.startInterval + "-" + node.EndInterval + "] and Data: " + node.val + "=>";
        if (node.right != null) {
            str = str + "Interval =[" + node.right.startInterval + "-" + node.right.EndInterval + "] and Data: "
                    + node.right.val + "=>";
        } else {
            str = str + "No Left Data";
        }
        System.out.println(str);
        // Call Recurssion
        if (node.left != null) {
            display(node.left);
        }
        if (node.right != null) {
            display(node.right);
        }
    }

    // Query
    public int query(int qsi, int qei) {
        return this.query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        if (node.startInterval >= qsi && node.EndInterval <= qei) {
            return node.val;
        } else if (node.startInterval > qsi || node.EndInterval < qei) {
            return 0;
        } else {
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    // update
    public void update(int index, int value) {
        this.root.val = update(this.root, index, value);
    }

    private int update(Node node, int index, int value) {
        if (index >= node.startInterval && index <= node.EndInterval) {
            if (index == node.startInterval && index == node.EndInterval) {
                node.val = value;
                return node.val;
            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.left, index, value);
                node.val = leftAns + rightAns;
                return node.val;
            }
        }
        return node.val;
    }
}
