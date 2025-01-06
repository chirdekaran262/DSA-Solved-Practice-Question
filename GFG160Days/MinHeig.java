
import java.util.Arrays;

public class MinHeig {
    public static void main(String[] args) {
    int[] arr={1, 5, 8, 10};
    System.out.println("Answer is: "+MinmizeHeights(arr,2));
    }

    private static int MinmizeHeights(int[] arr, int k) {
        Arrays.sort(arr);
        int ans=arr[arr.length-1]-arr[0];
        int smallest=arr[0]+k;
        int largest=arr[arr.length-1]-k;
        int mi,ma;
        for(int i=0;i<arr.length-1;i++){
            mi=Math.min(smallest,arr[i+1]-k);
            ma=Math.max(largest, arr[i]-k);
            if(mi<0) continue;
            ans=Math.min(ans, ma-mi);
        }
        return ans;
    }
}
