package Array_string;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][][]=new int[3][3][2];
        System.out.println("Enter the array element: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<2;k++){
                    a[i][j][k]=sc.nextInt();
                }
            }
        }
        System.out.print("Array Element is: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<2;k++){
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
