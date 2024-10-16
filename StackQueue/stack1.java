package StackQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(12);
        s.push(14);
        s.push(15);
        s.push(19);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println("-------------");

        Deque<Integer> d = new ArrayDeque<>();
        d.add(10);
        d.add(12);
        d.add(11);
        d.addFirst(19);
        d.addLast(16);
        System.out.println(d.removeFirst());
        System.out.println(d.removeLast());
        System.out.println(d.remove());
    }
}
