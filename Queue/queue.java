import java.util.Scanner;

class queue1 {
    /**
     * queue
     */
    static class queue {
        static int a[];
        static int size;
        static int r;

        queue(int n) {
            size = n;
            r = -1;
            a = new int[size];
        }

        public static boolean isempty() {
            return r == -1;
        }

        public static boolean full() {
            return r >= size - 1;
        }

        public static void add(int data) {
            if (full()) {
                System.out.println("Queue is full");
                return;
            } else {
                r++;
                a[r] = data;
                System.out.println(a[r] + " Element add at " + r);
            }
        }

        public static void remove() {
            if (isempty()) {
                System.out.println("Queue is empty");
                return;
            } else {
                int f = 0;
                System.out.print(a[f] + " Element remove from queue");
                for (int i = 0; i < r; i++) {
                    a[i] = a[i + 1];
                }
                r--;
            }
        }

        public static void show() {
            if (isempty()) {
                System.out.println("Queue is empty\n");
                return;
            } else {
                System.out.println("\n" + a[r] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Queue");
        int s = sc.nextInt();
        queue q = new queue(s);
        q.add(12);
        q.add(13);
        q.add(14);

        while (q.isempty() != true) {
            q.remove();
            q.show();
        }

    }
}