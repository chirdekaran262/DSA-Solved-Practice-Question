package Pattern;

public class pattern01 {
    public static void main(String[] args) {
        boolean b=false;
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                if(b==false){
                    System.out.print("0 ");
                    b=true;
                }
                else{
                    System.out.print("1 ");
                    b=false;
                }
             }
             System.out.println();
        }
    }
}
