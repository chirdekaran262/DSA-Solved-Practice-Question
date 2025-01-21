public class SerachInRotSorArr {
    public static void main(String[] args) {
        int[] arr={5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key=3;
        System.out.println("Answer: "+search(arr,key));
    }
    static int search(int[] arr, int key) {
        // Complete this function
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==key){
                return mid;
            }
            
            if(arr[mid]>=arr[l]){
                if(key>=arr[l] && key<arr[mid]){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(key<=arr[h]&&key>arr[mid]){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
        }
        return -1;
    }
}
