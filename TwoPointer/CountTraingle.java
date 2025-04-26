package TwoPointer;
import java.util.Arrays;
// Count the number of triangles that can be formed with the given sides    
class CountTriangle {
    static int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int cnt=0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                int low=j+1,high=arr.length-1;
                int target=arr[i]+arr[j];
                while(low<=high){
                    int mid=low+(high-low)/2;
                    if(arr[mid]<target){
                        low=mid+1;
                    }
                    else{
                        high=mid-1;
                    }
                   
                }
                 int c=(low-j-1);
                    cnt+=c;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 10, 15};
        System.out.println(countTriangles(arr)); // Output: 4
        // Explanation: The valid triangles are:
        // (4, 5, 10), (4, 5, 15), (4, 10, 15), (5, 10, 15).
        // So, the total count is 4.
    }
}