import java.util.*;

class FindSubArray {
    public int findSubarray(int[] arr) {
        // code here.
        int n = arr.length;
        int presum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            presum += arr[i];
            if (map.containsKey(presum)) {
                count += map.get(presum);
            }
            map.put(presum, map.getOrDefault(presum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        FindSubArray obj = new FindSubArray();
        int[] arr = { 1, 2, -3, 3, 7, -7 };
        int result = obj.findSubarray(arr);
        System.out.println("Number of subarrays with sum zero: " + result);
    }
}
