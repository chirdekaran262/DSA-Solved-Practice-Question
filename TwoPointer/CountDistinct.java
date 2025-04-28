package TwoPointer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
// Count Distinct Elements in every window of size k

class CountDistinct{
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        res.add(map.size());
        
        for(int i=k;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            map.put(arr[i-k],map.get(arr[i-k])-1);
            
            if(map.get(arr[i-k])==0){
                map.remove(arr[i-k]);
            }
            res.add(map.size());
        }
        return res;
    }
    public static void main(String[] args) {
        CountDistinct cd = new CountDistinct();
        int[] arr = {1, 2, 1, 3, 4, 2};
        int k = 3;
        ArrayList<Integer> result = cd.countDistinct(arr, k);
        System.out.println(result); // Output: [2, 3, 3, 2]
    }
}