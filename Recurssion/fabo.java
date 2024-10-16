package Recurssion;

public class fabo {
    public static int n1=1,n2=1,n3=0,sum=0;
    public static void main(String[] args) {
        System.out.println(Fabo(4));
        n1=1;
        n2=1;
        n3=0;

        printfibo(10);
    }

    public static int Fabo(int n) {
        if(n>0){
            sum=Fabo(n - 1) + n1;
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        return sum;
    }
    public static int s=0;
    public static void printfibo(int n){
        if(n>0){
            s=s+n1;
            System.out.print(" "+n1);
            n3=n1+n2;
            n1=n2;
            n2=n3;

            printfibo(n-1);
        }
        else{
            System.out.println("\n"+s);
        }
    }
}
