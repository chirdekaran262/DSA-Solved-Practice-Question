package Recurssion;

public class countZero {
    public static int s=0;
    public static void main(String[] args) {
        count(204505);
    }
    public static void count(int n) {

        int m=n%10;
        int n1=n/10;
        if(n1==0){
            System.out.println(s);
            return;
        }

        if(m==0){
            s++;
        }
        count(n1);
    }
}
