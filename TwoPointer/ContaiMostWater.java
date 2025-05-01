package TwoPointer;


public class ContaiMostWater {
    
    public int maxWater(int arr[]) {
        // Code Here
        int left=0,right=arr.length-1;
        int res=0;
        while(left<right){
            int water=Math.min(arr[left],arr[right])*(right-left);
            res=Math.max(res,water);
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        ContaiMostWater cmw = new ContaiMostWater();
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int result = cmw.maxWater(arr);
        System.out.println(result); // Output: 49 (maximum area)
    }
}
