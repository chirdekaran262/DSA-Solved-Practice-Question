package Recurssion;

public class pattern1 {
    public static void main(String[] args) {
        pattern(0,5);
    }
    public static void pattern(int n, int k) {
        if (n > k) {
            return;
        }

        if (n < k) {
            System.out.print("*");
            pattern(n + 1, k);
        } else {
            System.out.println();
            pattern(0, k - 1);
        }
    }
}