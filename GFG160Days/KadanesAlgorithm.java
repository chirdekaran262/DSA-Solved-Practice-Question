public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr={2, 3, -8, 7, -1, 2, 3};
        
        System.out.println("Answer: "+KadanesAlgo(arr));
    }
    static int KadanesAlgo(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
}
