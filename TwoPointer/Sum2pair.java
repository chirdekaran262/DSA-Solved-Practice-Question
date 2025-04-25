package TwoPointer;

class Sum2pair{
         int countPairs(int arr[], int target) {
            // Complete the function
             int left=0,right=arr.length-1;
            int res=0;
            while(left<right){
                int currSum=arr[left]+arr[right];
                
                if(currSum<target){
                    left++;
                }
                else if(currSum>target){
                    right--;
                }
                else{
                    int cnt1=0,cnt2=0;
                    int ele1=arr[left],ele2=arr[right];
                    while(left<right&&arr[left]==ele1){
                        left++;
                        cnt1++;
                    }
                    while(left<right&&arr[right]==ele2){
                        cnt2++;
                        right--;
                    }
                    if(ele1==ele2){
                        res+=(cnt1*(cnt1-1))/2;
                    }
                    else{
                        res+=cnt1*cnt2;
                    }
                }
            }
            return res;
        }
    
    public static void main(String[] args) {
        Sum2pair sp = new Sum2pair();
         int[] arr = {1, 1, 2, 2, 3, 3};
        int target = 4;
        System.out.println(sp.countPairs(arr, target)); // Output: 6
        // Explanation: The pairs are (1, 3), (1, 3), (2, 2), (2, 2), (3, 1), (3, 1).
        // Total 6 pairs.
        // Note: The pairs (1, 3) and (3, 1) are considered the same pair.
        // Hence, we count them only once.
        // The pairs (2, 2) are counted as 1 pair.
        // So, the total count is 6.

    }    
}