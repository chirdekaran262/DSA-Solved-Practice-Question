package Recurssion;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] a={4,7,5,2,1,8,3};
        selection(a,0,6);
        System.out.println(Arrays.toString(a));
    }
    public static void selection(int[] a,int n,int k){
        if(k==0){
            return;
        }
        if(n<k){
            selection(a,n+1,k);
            if(a[n]>a[n+1]){
                int temp=a[n];
                a[n]=a[n+1];
                a[n+1]=temp;
            }
        }
        else {
            selection(a,0,k-1);
        }
    }
}
