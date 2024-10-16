package Recurssion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a={3,1,7,5,4};
        quicksort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void quicksort(int[] a,int low,int high){
        if(low>high){
            return;
        }
        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int p=a[m];
        while (s<=e){
            while(a[s]<p){
                s++;
            }
            while(a[e]>p){
                e--;
            }
            if(s<=e){
                int temp=a[s];
                a[s]=a[e];
                a[e]=temp;
                e--;
                s++;
            }
        }
        quicksort(a,low,e);
        quicksort(a,s,high);
    }
}
