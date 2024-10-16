package Recurssion;

public class BinarySerachRotataion {
    public static void main(String[] args) {
        int[] a={2,5,3,7,1,0,6,8,9,4};
        System.out.println(search(a,8,0,a.length-1));
    }
    public static int search(int[] a, int k, int l, int r) {
        if (l > r) {
            return -1;
        }
        int m=l+(r-l)/2;
        if (k == a[m]) {
            return m;
        }
        if(a[l]<=a[m]) {
            if (k >= a[l] && k <=a[m]) {
                return search(a, k, l, m - 1);
            }
            else{
                return search(a, k, m+1, r);
            }
        }
        if(k>=a[m]&&k<=a[r]) {
            return search(a, k, m+1, r);
        }
        return search(a, k, l, m-1);
    }
}
