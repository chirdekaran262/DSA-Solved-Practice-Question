import java.util.Arrays;

class mergeSort{
    public static void main(String[] args) {
        int[] arr={3,2,5,4,1,7,6};
        divide(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void divide(int[] arr, int s,int e) {
        if(s>=e){
            return;
        }
        int mid = s+(e-s)/2;
        divide(arr,s,mid);
        divide(arr,mid+1,e);
        merge(arr,s,mid,e);
    }

    private static void merge(int[] arr, int s, int mid, int e) {
        int[] temp=new int[e-s+1];
        int i=s,j=mid+1;
        int k=0;
        while(i<=mid && j<=e){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=e){
            temp[k++]=arr[j++];
        }
        System.arraycopy(temp,0,arr,s,temp.length);
    }
}
