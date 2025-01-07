public class MaxPrduct {
    public static void main(String[] args) {
        int[] arr={-2, 6, -3, -10, 0, 2};
        System.out.println("Answer: "+maxProduct(arr));
    }
    static int maxProduct(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int maxProduct=arr[0];
        int minProduct=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp=maxProduct;
                maxProduct=minProduct;
                minProduct=temp;
            }
            maxProduct=Math.max(arr[i],maxProduct*arr[i]);
            minProduct=Math.min(arr[i],minProduct*arr[i]);
            res=Math.max(res,maxProduct);
        }
        return res;
    }
}
