package StackQueue;

public class stackE {
    protected int data[];
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public stackE() {
        this(DEFAULT_SIZE);
    }

    public stackE(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isfull()) {
            System.out.println("Stack Is Full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isfull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public int pop() throws StackExcepation {
        if (isEmpty()) {
            throw new StackExcepation("Stack Is Empty");
        }
        int removed = data[ptr];
        // System.out.printf("%d Item is removed ",data[ptr]);
        ptr--;
        return removed;
    }

    public int ispeek() throws StackExcepation {
        if (isEmpty()) {
            throw new StackExcepation("Stack IS Empty");
        }
        return data[ptr];
    }
}
