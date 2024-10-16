package Recurssion;

public class R1 {
    public static void main(String[] args) {
        pn(1);

    }

    public static void pn(int n) {
        if (n <= 5) {
            System.out.println(n);
            pn(n + 1);
        }

    }
}
