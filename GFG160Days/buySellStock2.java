//Buy and Sell Stock at multiple time


public class buySellStock2 {
    public static void main(String[] args) {
        int[] prices={100, 180, 260, 310, 40, 535, 695};
        System.out.println("Max Profit : "+maximumProfit(prices));
        }
        
        static int maximumProfit(int[] prices) {
            int maxProfit=0;

            for(int i=1;i<prices.length;i++){
                if(prices[i]>prices[i-1]){
                    maxProfit+=(prices[i]-prices[i-1]);
                }
            }
            return maxProfit;
        }
}
