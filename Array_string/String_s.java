package Array_string;

import java.util.Scanner;

public class String_s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] str=new String[5];
        System.out.println("Enter the string: ");
        for(int i=0;i<5;i++){
            str[i]=sc.next();
        }
        System.out.println("String Element is: ");
        for(int i=0;i<5;i++){
            System.out.print(str[i]+" ");
        }
    }
}
