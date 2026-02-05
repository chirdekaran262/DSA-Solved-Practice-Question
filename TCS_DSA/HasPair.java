import java.util.HashSet;
import java.util.Set;

class HasPair{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;
        System.out.println(hasPair(arr, target)); // Output: true
    }
    public static boolean hasPair(int[] arr, int target){
        Set<Integer> set = new HashSet<>();
        for(int num:arr){
            int diff=target-num;
            if(set.contains(diff)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}