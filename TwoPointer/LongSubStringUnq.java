package TwoPointer;
import java.util.HashSet;

class LongSubStringunq{
    public int longestUniqueSubstr(String s) {
        // code here
        int left=0,right=0;
        int cnt=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            int cur=0;
            if(set.add(s.charAt(i))){
                right=i;
                cur=right-left+1;
                if(cnt<cur){
                    cnt=cur;
                }
            }
            else{
                while(s.charAt(left)!=s.charAt(i)){
                    set.remove(s.charAt(left));
                    left++;
                }
                left++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        LongSubStringunq lsu = new LongSubStringunq();
        String s = "abcabcbb";
        int result = lsu.longestUniqueSubstr(s);
        System.out.println(result); // Output: 3 (substring "abc")
        // Test with another string
    }
}