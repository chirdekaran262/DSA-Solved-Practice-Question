import java.util.*;

class RelativeSort {
    static void relativeSort(int[] a1, int[] a2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int a1Index = 0;

        // Step 1: Count frequencies of elements in a1
        for (int i : a1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Step 2: Place elements of a2 in a1 in the correct order
        for (int i : a2) {
            while (map.getOrDefault(i, 0) > 0) {
                a1[a1Index++] = i;
                map.put(i, map.get(i) - 1);
            }
            map.remove(i); // Clear it so it's not processed again
        }

        // Step 3: Collect remaining elements
        int remainingStartIndex = a1Index;
        for (int key : map.keySet()) {
            int count = map.get(key);
            while (count > 0) {
                a1[a1Index++] = key;
                count--;
            }
        }

        // Step 4: Sort only the elements that weren't in a2
        Arrays.sort(a1, remainingStartIndex, a1.length);
    }

    public static void main(String[] args) {
        int[] a1 = {4, 1, 3, 3, 2};
        int[] a2 = {3, 1};

        // Pass the arrays into the static method
        relativeSort(a1, a2);

        // Use Arrays.toString to print the content
        System.out.println("Relative sort result: " + Arrays.toString(a1));
    }
}
