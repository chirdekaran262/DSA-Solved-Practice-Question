package TwoPointer;

import java.util.Arrays;

public class CountPair {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int left=0,right=arr.length-1;
        int cnt=0;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum<target){
                cnt+=right-left;
                left++;
            }
            else{
                right--;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        CountPair cp = new CountPair();
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;
        System.out.println(cp.countPairs(arr, target)); // Output: 4
    }
    // Example usage
}
