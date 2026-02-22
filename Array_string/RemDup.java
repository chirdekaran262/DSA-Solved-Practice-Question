
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class RemDup {
    public static void main(String[] args) {
        int[] arr = { 44, 21, 21, 5, 2, 2, 6, 8, 9, 4, 9, 10, 8, 5 };
        int[] arrA = RemoveDup(arr);
        for (int n : arrA)
            System.out.print(" " + n);
    }

    public static int[] RemoveDup(int[] arr) {
        int j = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int k = 0; k < arr.length; k++) {
            if (set.add(arr[k])) {
                arr[j] = arr[k];
                j++;
            }
        }
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
        return arr;
    }
}