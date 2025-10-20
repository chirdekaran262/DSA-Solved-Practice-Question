class LPSubstring {

    static String getLongestPal(String s) {
        int n = s.length();

        int start = 0, maxLen = 1;

        for (int i = 0; i < n; i++) {

            // this runs two times for both odd and even 
            // length palindromes. 
            // j = 0 means odd and j = 1 means even length
            for (int j = 0; j <= 1; j++) {
                int low = i;
                int high = i + j; 

                // expand substring while it is a palindrome
                // and in bounds
                while (low >= 0 && high < n && s.charAt(low) == s.charAt(high)) 
                {
                    int currLen = high - low + 1;
                    if (currLen > maxLen) {
                        start = low;
                        maxLen = currLen;
                    }
                    low--;
                    high++;
                }
            }
        }

        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        System.out.println(getLongestPal(s));
    }
}