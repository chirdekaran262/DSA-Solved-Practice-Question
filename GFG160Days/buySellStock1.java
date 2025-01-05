
// Buy And Sell Stock At most at one time

public class buySellStock1{
    public static void main(String[] args) {
        int[] prices={100, 180, 260, 310, 40, 535, 695};
        System.out.println("Maximum Profit : "+maximumProfit(prices));
    }

    static int maximumProfit(int[] prices) {
        int minSoFor=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(minSoFor>prices[i]){
                minSoFor=prices[i];
            }
            if(maxprofit<(prices[i]-minSoFor)){
                maxprofit=prices[i]-minSoFor;
            }
        }
        return maxprofit;
    }
}