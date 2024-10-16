package Recurssion;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] a={4,7,2,9,1,5,3};
        bubble(a,0,6);
        System.out.print(Arrays.toString(a));
    }
    public static void bubble(int[] a,int n,int k){
        if(k==0){
            return;
        }
        if(n<k){
            if(a[n]>a[n+1]){
                int temp=a[n];
                a[n]=a[n+1];
                a[n+1]=temp;
            }
            bubble(a,n+1,k);
        }
        else{
            bubble(a,0,k-1);
        }
    }
}
