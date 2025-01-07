class CirMax{
    public static void main(String[] args) {
        int[] arr={8, -8, 9, -9, 10, -11, 12};
        System.out.print("Answer: "+circularMax(arr));
        }
    
        static  int circularMax(int[] arr) {
            int n=arr.length;
            int arrSum=0;
            int maxSum=Integer.MIN_VALUE;
            int minSum=Integer.MAX_VALUE;

            int minTemp=0;
            int maxTemp=0;

            for(int i=0;i<n;i++){
                arrSum+=arr[i];

                maxTemp+=arr[i];
                maxSum=Math.max(maxSum,maxTemp);
                maxTemp=Math.max(maxTemp, 0);

                minTemp+=arr[i];
                minSum=Math.min(minSum, minTemp);
                minTemp=Math.min(0,minTemp);

            
            }
            if(arrSum==minSum){
                return maxSum;
            }
            return Math.max(maxSum,(arrSum-minSum));
        }
}