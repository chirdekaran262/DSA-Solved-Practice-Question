public class Main {
    public static void main(String[] args) {
        // AVL avl = new AVL();
        // for (int i = 0; i < 10; i++) {
        // avl.insert(i);
        // }
        // avl.display();

        // Segment Tree

        int[] arr = { 2, 5, -2, 6, 8, 1, 9, 10, 11 };
        SegmentTree st = new SegmentTree(arr);
        // st.display();
        System.out.println(st.query(1, 4));

    }
}
