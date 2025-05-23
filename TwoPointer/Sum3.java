package TwoPointer;

public class Sum3 {
    public static int countTriplets(int[] arr, int target) {
        // Code Here
        int n=arr.length;
        int res=0;
        for(int i=0;i<arr.length-2;i++){
            int left=i+1,right=arr.length-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum<target){
                    left+=1;
                }
                else if(sum>target){
                    right-=1;
                }
                else if(sum==target){
                    int ele1=arr[left],ele2=arr[right];
                    int cnt1=0,cnt2=0;
                    while(left<=right&&arr[left]==ele1){
                        left++;
                        cnt1++;
                    }
                    while(left<=right&&arr[right]==ele2){
                        right--;
                        cnt2++;
                    }
                    if(ele1==ele2){
                        res+=(cnt1*(cnt1-1))/2;
                    }
                    else{
                        res+=(cnt1*cnt2);
                    }
                }
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 6;
         int result = countTriplets(arr, target);
        System.out.println("Number of triplets: " + result); // Output: Number of triplets: 2
    }
}
