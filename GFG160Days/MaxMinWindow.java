import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Arrays;

public class MaxMinWindow {

    public static ArrayList<Integer> maxOfMin(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = 
            new ArrayList<>(Collections.nCopies(n, 0));
        ArrayList<Integer> len = 
            new ArrayList<>(Collections.nCopies(n + 1, 0));
        Deque<Integer> stack = new ArrayDeque<>();

        // Compute previous and next smaller elements using monotonic stack
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                int top = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;
                int windowSize = right - left - 1;
                len.set(windowSize, 
                    Math.max(len.get(windowSize), arr[top]));
            }
            stack.push(i);
        }

        // Process remaining elements
        while (!stack.isEmpty()) {
            int top = stack.pop();
            int left = stack.isEmpty() ? -1 : stack.peek();
            int right = n;
            int windowSize = right - left - 1;
            len.set(windowSize, 
                Math.max(len.get(windowSize), arr[top]));
        }

        // Fill result using len[]
        for (int i = 1; i <= n; i++) {
            res.set(i - 1, len.get(i));
        }

        // Ensure result is non-increasing
        for (int i = n - 2; i >= 0; i--) {
            res.set(i, Math.max(res.get(i), res.get(i + 1)));
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 10, 70, 30};
        ArrayList<Integer> res = maxOfMin(arr);
        for (int val : res) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}