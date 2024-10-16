package StackQueue;

public class DyanamicQueue extends CircularQueue {
    public DyanamicQueue() {
        super();
    }

    public DyanamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if (isfull()) {
            int[] temp = new int[data.length * 2];
            // System.arraycopy(data, 0, temp, 0, data.length);
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        return super.insert(item);
    }
}
