public class bank {
    public static void main(String[] args) {
        int[][] balance={{90,43},
                         {99,47},
                         {49,83}};
       
    
        int max=maxbalance(balance);
                System.out.print(max);

    }
    static int maxbalance(int[][] balance){
        int ans=Integer.MIN_VALUE;
        for (int[] i : balance) {
            int sum=0;
            for (int anInt: i) {
                sum+=anInt;
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
}
}
