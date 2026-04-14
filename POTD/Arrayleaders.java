import java.util.*;


class Arrayleaders {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        int max=arr[n-1];
        list.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(max<=arr[i]){
                max=arr[i];
                list.addFirst(max);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};
        System.out.println(leaders(arr));
    }
}
