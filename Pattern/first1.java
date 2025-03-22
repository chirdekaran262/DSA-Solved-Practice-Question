package Pattern; 

public class first1 {
    public static void main(String[] args) {
        int n=4;
        int k=0;
        for(int i=0;i<n;i++){
            
            System.out.println();
            for(int j=n;j>i;j--){
                System.out.print(k+" ");
                k++;
            }
            
        }
    }
}
