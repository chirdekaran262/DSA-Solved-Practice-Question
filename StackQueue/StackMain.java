package StackQueue;

public class StackMain {
    public static void main(String[] args) throws StackExcepation {
        stackE s = new stackE(5);
        s.push(10);
        s.push(12);
        s.push(14);
        s.push(15);
        s.push(19);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        stackE ds = new DynamicStack(5);
        ds.push(10);
        ds.push(12);
        ds.push(14);
        ds.push(15);
        ds.push(15);
        ds.push(15);
        ds.push(19);

    }
}
