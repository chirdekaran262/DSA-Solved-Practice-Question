import java.util.Arrays;
import java.util.Scanner;

public class Binary_2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]={
            {10,20,30,40},
            {15,25,35,45},
            {18,27,37,49},
            {20,30,40,50}
        };
        System.out.print("Enter the element to search: ");
        int x=sc.nextInt();
        //int[] index=ArraytoString.search(a, x);
        /*if(index==-1){
            System.out.print("Element Not Found in array");
        }*/
        //else{
            search(a, x);
        //}
    }
    static void search(int a[][],int x){
        int r=0;
        int c=3;
        while(r<a.length && c>=0){
            if(a[r][c]==x){
                System.out.print(x+"Element found at position: "+"["+r+"]["+c+"]");
                //return new int[]{r,c};
                break;
            }
            else if(a[r][c]<x){
                r++;
            }
            else if(a[r][c]>x){
                c--;
            }
        }
        if(r>3 || c<=0){
        System.out.print("Element Not found");
        }
    }
}
