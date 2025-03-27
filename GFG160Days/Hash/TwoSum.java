package GFG160Days.Hash;

import java.util.HashSet;

public class TwoSum {
    // Time Complexity is O(n*n) and Space Complexity is O(1)
//     boolean twoSum(int arr[], int target) {
//         // code here
//         Arrays.sort(arr);
//         for(int i=0;i<arr.length;i++){
//             int rem = target - arr[i];
//             if(binarySearch(i+1,arr.length-1,arr, rem)){
//                 return true;
//             }
//         }
//         return false;
//     }
//    static  boolean binarySearch(int low,int high,int arr[],int find){
//         while(low<=high){
//             int mid = low + (high-low)/2;
//             if(arr[mid]==find){
//                 return true;
//             }
//             else if(arr[mid]<find){
//                 low = mid+1;
//             }
//             else{
//                 high = mid-1;
//             }
//         }
//         return false;
//     }

    // Time Complexity is O(n) and Space Complexity is O(1)
    public boolean twoSum(int[] arr,int target){
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int rem = target - arr[i];
            if(set.contains(rem)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        TwoSum obj = new TwoSum();
        System.out.println(obj.twoSum(arr, target));
    }
}
