import java.util.*;

class Binary_search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={3,5,8,2,-3,-6,9,-8,-5,-1,2,2,};
        int n=10;
        System.out.println("Array Element is: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println("\nEnter the number to search in array: ");
        int x=sc.nextInt();
    
        for(int i=0;i<n;i++){
            if(a[i]==x){
                System.out.println(x+" Element found at position "+i);
                break;
            }
            else{
                if(i>=n-1){
                System.out.println("Element not found in array");
                }
            }
        }
        
    }
}