public class Peak {
    public static void main(String[] args) {
        int[] arr={1, 2, 4, 5, 7, 8, 3};
        System.out.println("Answer: "+peakElement(arr));
    }
    public static int peakElement(int[] arr) {
        // code here
        int n=arr.length;
        
        if(n==0){
            return 0;
        }
        
        if(arr.length==1){
            return 0;
        }
        
        if(arr.length==2){
            if(arr[0]>arr[1]){
                return 0;
            }
            else{
                return 1;
            }
        }
        
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i]&&arr[i]>arr[i+1]){
                return i;
            }
        }
        //Check the extrme point
        if(arr[0]>arr[1]){
            return 1;
        }
        if(arr[arr.length-1]>arr[arr.length-2]){
            return arr.length-1;
        }
        return -1;
    }
}
