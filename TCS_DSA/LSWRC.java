import java.util.HashSet;
import java.util.Set;

class LSWRC{
    public static void main(String[] args) {
        String str="abcabcbb";
        System.out.println("Longest Substring Without Repeating Characters: " + lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxLength=0;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            maxLength=Math.max(maxLength,i-left+1);
        }
        return maxLength;
    }
}