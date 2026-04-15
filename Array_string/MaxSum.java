import java.util.*;

class MaxSum {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxLength=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxLength=Math.max(maxLength,i+1);
            }
            else if(map.containsKey(sum)){
                maxLength=Math.max(maxLength,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        if(map.get(0)!=null && (map.get(0)+1)>maxLength){
            return map.get(0)+1;
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int arr[]={15, -2, 2, -8, 1, 7, 10, 23};
        MaxSum obj=new MaxSum();
        System.out.println(obj.maxLength(arr));
    }
}