package Binary;

import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int l=0;
        int[] arr=new int[n];
        System.out.println("Enter the number in array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to search: ");
        int x=sc.nextInt();
        sort(arr,n);
        int s=binarysearch(arr,x,n,l);
        if(s==-1){
            System.out.println("Element Not found in this array");
        }
        else{
            System.out.println(x+" Element found at position "+s);
        }
    }

    static int binarysearch(int arr[],int x,int n,int l){
        int mid=(l+n)/2;
        if(mid>=0){
            if(arr[mid]==x){
                return mid;
            }
            else if(x<arr[mid]){
                return binarysearch(arr, x, mid-1, l);
            }
            else{
                return binarysearch(arr, x, n, mid+1);
            }
        }
        return -1;
    }
    static void sort(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Array Element in ascending order: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

