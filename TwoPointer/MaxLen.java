package TwoPointer;
import java.util.HashMap;
class MaxLen{
    public int maxLen(int[] arr) {
        // Your code here
        int res=0,prefSum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            prefSum+=(arr[i]==0)?-1:1;
            if(prefSum==0){
                res=i+1;
            }
            if(map.containsKey(prefSum)){
                res=Math.max(res,i-map.get(prefSum));
            }
            else{
                map.put(prefSum,i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        MaxLen obj = new MaxLen();
        int[] arr = {1, 0, 0, 1, 1, 0};
        int result = obj.maxLen(arr);
        System.out.println(result); // Output: 4 (subarray [0, 0, 1, 1] has length 4)
    }
}