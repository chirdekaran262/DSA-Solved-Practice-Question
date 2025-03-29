package GFG160Days.Hash;
import java.util.*;

class intersection {
    static List<Integer> intersection(List<Integer> a, List<Integer> b) {
      
        // Put all elements of a[] in as
        Set<Integer> as = new HashSet<>(a);  
      
        Set<Integer> rs = new HashSet<>();                    
        List<Integer> res = new ArrayList<>();                            

        // Traverse through b[]
        for (int i = 0; i < b.size(); i++) {
          
            // If the element is in as and not yet in rs
            // a) Add it to the result set
            // b) Add it to the result array
            if (as.contains(b.get(i)) && 
                !rs.contains(b.get(i))) {
                rs.add(b.get(i)); 
                res.add(b.get(i)); 
            }
        }

        return res;
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3, 2, 1);
        List<Integer> b = Arrays.asList(3, 2, 2, 3, 3, 2);

        List<Integer> res = intersection(a, b);
      
        for (int i = 0; i < res.size(); i++) 
            System.out.print(res.get(i) + " ");
    }
}