package Recurssion;

import java.util.Scanner;

public class SOD {
    public static int sum=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        SOD s=new SOD();
        System.out.println(s.sumofdigit(num));
    }
    public int sumofdigit(int num){


        if(num==0){
            return 0;
        }
        return (num%10)+sumofdigit(num/10);
    }
}
