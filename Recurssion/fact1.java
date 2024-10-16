package Recurssion;

import java.util.Scanner;

public class fact1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find fact: ");
        int n = sc.nextInt();
        fact1 s = new fact1();
        System.out.printf("Factorial of number %d is %d ", n, s.fact(n));
    }

    public int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return fact(n - 1) * n;
    }
}
