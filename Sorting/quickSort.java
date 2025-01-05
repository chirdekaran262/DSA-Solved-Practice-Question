import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr={7,5,2,1,6,4,3};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quick(int[] arr, int low, int high) {
        if(low >= high) {
            return;
        }
        int i = low;
        int j = high;
        int mid=i+(j-i)/2;
        int pivot = arr[mid];

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <=j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        quick(arr,low,mid-1);
        quick(arr,mid+1,high);

    }
}
