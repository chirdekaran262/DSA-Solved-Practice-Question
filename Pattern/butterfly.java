package Pattern;

public class butterfly {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==j || i+j==4 || j==0 || j==4)
                    System.out.print("*");
                
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
