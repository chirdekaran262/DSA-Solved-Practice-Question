package Recurssion;

public class pattern2 {
    public static void main(String[] args) {
        pattern(0,5);
    }
    public static void pattern(int n, int k) {
        if (k==0) {
            return;
        }
        if(n<k){
            pattern(n+1,k);
            System.out.print("*");

        }
        else{

            pattern(0,k-1);
            System.out.println();
        }
    }
}
