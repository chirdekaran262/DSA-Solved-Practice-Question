class MaxSubArraySum{
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums) {
       int currentMax=nums[0];
       int Max=nums[0];
       
       for(int i=1;i<nums.length;i++){
           currentMax=Math.max(nums[i],currentMax+nums[i]);
           Max=Math.max(currentMax,Max);
       }
       return Max;
    }
}