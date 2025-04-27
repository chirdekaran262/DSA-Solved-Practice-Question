package TwoPointer;
import java.util.ArrayList;

class SubArraySum{
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int s=0,e=0;
        ArrayList<Integer> res=new ArrayList<>();
        int curr=0;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            if(curr>=target){
                e=i;
                while(curr>target&&s<=e){
                    curr-=arr[s];
                    ++s;
                }
            }
            if(curr==target){
                    res.add(s+1);
                    res.add(e+1);
                    return res;
                }
        }
        res.add(-1);
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        ArrayList<Integer> result = subarraySum(arr, target);
        System.out.println(result); // Output: [2, 4]
        // Explanation: The subarray from index 2 to 4 (1-based index) has a sum of 12.
    }

}