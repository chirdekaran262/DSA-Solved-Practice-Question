package GFG160Days.Hash;
import java.util.ArrayList;
import java.util.List;

class sum3{
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
       List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> list=new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        res.add(list);
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        sum3 obj = new sum3();
        List<List<Integer>> result = obj.findTriplets(arr);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }

    }
}