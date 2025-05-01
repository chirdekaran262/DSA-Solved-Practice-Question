package TwoPointer;

public class TrapRainWater {
    public int maxWater(int arr[]) {
        // code here
        int res=0;
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        
        for(int i=0;i<n;i++){
            int minof2=Math.min(left[i],right[i]);
            res+=minof2-arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        TrapRainWater trw = new TrapRainWater();
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = trw.maxWater(arr);
        System.out.println(result); // Output: 6 (trapped water)
     }
}
