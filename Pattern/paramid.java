package Pattern;

public class paramid {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=3;j>=i;j--){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
