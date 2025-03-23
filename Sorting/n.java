import java.util.*;

class nonrep {
    public int firstNonRepeating(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        
         for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Find the first element with frequency 1
        for (int num : arr) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        
        return -1; // If no non-repeating element is found
    }

    public static void main(String[] args) {
        nonrep sol = new nonrep();
        int[] arr = {4, 5, 1, 2, 0, 4, 5, 2};
        System.out.println(sol.firstNonRepeating(arr)); // Output: 1
    }
}
