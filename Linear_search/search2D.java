import java.util.Scanner;

public class search2D {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[][] a={{34,89,23,56,79},
                   {67,38,29,70,45}};
        int n=a.length;
        System.out.print("Enter the number to serch in array: ");
        int x=sc.nextInt();
        int l=search(a,n,x);
        if(l==-1){        
            System.out.println("Element not found in array");
        }
        else{
            System.out.print("");
        }
    }
    static int search(int[][] a,int n,int x){
        if(n==0){
                System.out.println("Array is Empty");
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<5;j++){
                if(a[i][j]==x){
                      System.out.println("["+i+"]["+j+"] at this position element "+x);
                    return 1;
                }
            }
        }
        return -1;
    }
}
