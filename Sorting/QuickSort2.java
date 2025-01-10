public class QuickSort2 {
    public static void main(String[] args) {
        int[] arr={2,5,1,3,6,8,7};
        quicksort(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++) {
            System.out.println("  "+arr[i]);
        }
    }
    static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int p=partition(arr,low,high);
            quicksort(arr, low, p-1);
            quicksort(arr, p+1, high);
        }
        
    } 
    static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low;
        int j=high-1;
        while(i<=j){
            while(i<=high && arr[i]<=pivot){
                i++;
            }
            while(j>=low && arr[j]>pivot){
                j--;
            }
            if(i<j){
                swap(arr, i, j);
            }
        }
        swap(arr, high, i);
        return i;
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
