package TwoPointer;
import java.util.HashMap;
class SubArr{
    public int longestSubarray(int[] arr, int k) {
        // code here
        
        int res=0,prefsum=0;
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<arr.length;i++){
            prefsum+=arr[i];
            if(prefsum==k){
                res=i+1;
            }
            else if(map.containsKey(prefsum-k)){
                res=Math.max(res,i-map.get(prefsum-k));
            }
            if(!map.containsKey(prefsum)){
                map.put(prefsum,i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        SubArr obj = new SubArr();
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        int result = obj.longestSubarray(arr, k);
        System.out.println(result); // Output: 2 (subarray [2, 3] has sum 5)
    }
}