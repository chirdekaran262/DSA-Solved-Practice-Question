import java.util.HashMap;

class LongestRepeatingCharacterReplacement {
    public int longestSubstr(String s, int k) {
        // code here
        
      HashMap<Character , Integer> map = new HashMap<>();
        int totalFreqCnt = 0;
        int maxFreq = 0;
        
        int n = s.length();
        int i = 0;
        int j = 0;
        int maxLen = 0;
        
        while(j < n){
            char right = s.charAt(j);
            map.put(right , map.getOrDefault(right , 0) + 1);
            maxFreq = Math.max(maxFreq , map.get(right));
            totalFreqCnt++;
            while(map.size() > 2 && ((totalFreqCnt - maxFreq) > k)){
                char left = s.charAt(i);
                map.put(left , map.getOrDefault(left , 0) - 1);
                totalFreqCnt--;
                if(map.get(left) <= 0){
                    map.remove(left);
                }
                maxFreq = 0;
                for(char letter : map.keySet()){
                    maxFreq = Math.max(maxFreq , map.get(letter));
                }
                
                i++;
            }
            maxLen = Math.max(maxLen , (j - i + 1));
            j++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement lrcr = new LongestRepeatingCharacterReplacement();
        String s = "AABABBA";
        int k = 1;
        System.out.println(lrcr.longestSubstr(s, k)); // Output: 4
    }
}
