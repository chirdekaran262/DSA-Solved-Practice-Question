package GFG160Days.Hash;

import java.util.HashMap;
import java.util.Map;

public class TwoSumCnt {
     int countPairs(int arr[], int target) {
        // Your code here
        Map<Integer,Integer> map=new HashMap<>();
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                cnt+=map.get(target-arr[i]);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1};
        int target = 2;
        TwoSumCnt obj = new TwoSumCnt();
        System.out.println(obj.countPairs(arr, target));
    }
}
