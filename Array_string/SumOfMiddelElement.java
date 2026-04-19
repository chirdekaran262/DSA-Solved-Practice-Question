import java.util.*;
class SumOfMiddelElement {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:arr1){
            list.add(i);
        }
        for(int j:arr2){
            list.add(j);
        }
        Collections.sort(list, Collections.reverseOrder());
        int n=list.size();
        int mid=(n-1)/2;
        return list.get(mid)+list.get(mid+1);
    }
    public static void main(String[] args) {
        SumOfMiddelElement sol = new SumOfMiddelElement();
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int result = sol.SumofMiddleElements(arr1, arr2);
        System.out.println("Sum of middle elements: " + result);
    }
}