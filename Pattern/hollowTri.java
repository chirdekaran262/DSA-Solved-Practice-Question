package Pattern;

public class hollowTri {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<=5-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                if(j==0 || j==i || i==5-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
             }
            System.out.println();
        }
    }
}
