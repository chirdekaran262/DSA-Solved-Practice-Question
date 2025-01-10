import java.util.*;

class FirstNonRep{

    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String str="abbcaacdacba";
        System.out.println("Answer : "+nonRepeatingChar(str));
    }
}