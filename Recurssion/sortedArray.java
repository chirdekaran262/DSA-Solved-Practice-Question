package Recurssion;

public class sortedArray {
    public static void main(String[] args) {
        int[] a={12,4,55,56,76};
        System.out.println(sort(a,0));
    }
    public static boolean sort(int[] a,int i){
        if(i==a.length-1)
            return true;
        if(a[i]<a[i+1])
            return sort(a,i+1);
        return false;
    }
}
