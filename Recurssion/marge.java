package Recurssion;

import java.util.Arrays;

import static java.io.ObjectInputFilter.merge;

public class marge {
    public static void main(String[] args) {
        int[] a={4,7,1,9,6,5};
        int[] b=margesort(a);
        System.out.println(Arrays.toString(b));
    }

    public static int[] margesort(int[] a) {
        if(a.length == 1){
            return a;
        }
        int mid=a.length/2;
        int[] left=margesort(Arrays.copyOfRange(a,0,mid));
        int[] right=margesort(Arrays.copyOfRange(a,mid,a.length));
        return merge(left,right);
    }
    private static int[] merge(int[] first,int[] second){
        int[] mix=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
                k++;
            }
            else{
                mix[k]=second[j];
                k++;
                j++;
            }
        }
        while(i<first.length){
            mix[k]=first[i];
            k++;
            i++;
        }
        while(j<second.length){
            mix[k]=second[j];
            k++;
            j++;
        }
        return mix;
    }
}
