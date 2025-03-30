package GFG160Days.Hash;
import java.util.*;
class Union {
    public static int findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for(int e:a){
            set.add(e);
        }
        for(int e:b){
            set.add(e);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,2,3};
        System.out.println(findUnion(a,b));
    }
}