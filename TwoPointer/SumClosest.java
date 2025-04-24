package TwoPointer;
import java.util.*;
public class SumClosest {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        int n=arr.length;
        int mindiff=Integer.MAX_VALUE;
        int left=0,right=n-1;
        List<Integer> res=new ArrayList<>();
        Arrays.sort(arr);
        while(left<right){
            int currSum=arr[left]+arr[right];
            if(Math.abs(target-currSum)<mindiff){
                mindiff=Math.abs(target-currSum);
                res=Arrays.asList(arr[left],arr[right]);
            }
            if(currSum<target){
                left++;
            }
            else if(currSum>target){
                right--;
            }
            else{
                return res;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        SumClosest sc = new SumClosest();
        int[] arr = {1, 2, 3, 4, 5};
        int target = 6;
        System.out.println(sc.sumClosest(arr, target)); // Output: [1, 5]
    }
}
