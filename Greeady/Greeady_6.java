package Greeady;
import java.util.*;

public class Greeady_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int coin[]={2000,500,100,50,20,10,5,2,1};
        System.out.println("Enter the amount: ");
        int amount=sc.nextInt();
        int NumberCoin=0;

        ArrayList<Integer> containing_coin=new ArrayList<>();

        for(int i=0;i<coin.length;i++){
            while(amount>=coin[i]){
                NumberCoin++;
                amount-=coin[i];
                containing_coin.add(coin[i]);
            }
        }
        System.out.println("Coin used for amount: ");
        for(int i=0;i<containing_coin.size();i++){
            System.out.print(" "+containing_coin.get(i));
        }

        System.out.println("\nTotal Number of coin is: "+NumberCoin);
    }
}
