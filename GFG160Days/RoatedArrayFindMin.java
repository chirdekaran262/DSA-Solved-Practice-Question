public class RoatedArrayFindMin {
    public static void main(String[] args) {
        int[] arr={5, 6, 1, 2, 3, 4};
        System.out.println("Answer: "+findMin(arr));
    }
    
    public static int findMin(int[] arr) {
        // complete the function here
        int i=0,j=arr.length-1;
        int min=Integer.MAX_VALUE;
        while(i<=j){
            if(arr[i]<arr[j]){
                if(min>arr[i]){
                    min=arr[i];
                }
            }
            else{
                if(min>arr[j]){
                    min=arr[j];
                }
            }
            i++;
            j--;
        }
        return min;
    }
}
