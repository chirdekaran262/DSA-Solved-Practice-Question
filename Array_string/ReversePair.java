package Array_string;

public class ReversePair {
    public static void main(String[] args) {
        int[] nums={2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};

        System.out.println(reversePairs(nums));
    }
    public static int reversePairs(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                long temp=nums[i]*2;
                if(i<j && nums[i]>temp){
                    System.out.printf("%d %d \n",2*nums[j],nums[i]);
                    sum++;
                }
            }
        }
        return sum;
    }
}
