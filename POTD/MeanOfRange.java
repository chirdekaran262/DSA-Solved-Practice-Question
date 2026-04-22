import java.util.ArrayList;
class MeanOfRange {
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int sum[]=new int[arr.length];
        sum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            sum[i]=sum[i-1]+arr[i];
        }
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            res.add((sum[r]-(l>0?sum[l-1]:0))/(l>0?r-l+1:r+1));
        }
        return res;
    }
    public static void main(String[] args) {
        MeanOfRange mr = new MeanOfRange();
        int[] arr = {1, 2, 3, 4, 5};
        int[][] queries = {{0, 2}, {1, 3}, {0, 4}};
        System.out.println(mr.findMean(arr, queries)); // [2, 3, 3]
    }
}