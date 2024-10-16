package Greeady;
import java.lang.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Greeady_4 {
    public static void main(String[] args) {
        int a[]={2,5,3,1,4};
        int b[]={7,8,10,6,9};

        Arrays.sort(a);
        Arrays.sort(b);

        int mindiff=0;

        for(int i=0;i<a.length;i++){
            mindiff+=Math.abs(a[i]-b[i]);
        }

        System.out.println("Minimum differance sum is: "+mindiff);
    }
}
