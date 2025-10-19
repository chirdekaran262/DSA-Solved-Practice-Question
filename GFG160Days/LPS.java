import java.util.*;

class LPS {

    static int longestPalinSubseq(String s) {
        int n = s.length();

        int[] curr = new int[n];
        int[] prev = new int[n];

        for (int i = n - 1; i >= 0; --i) {

            curr[i] = 1;

            for (int j = i + 1; j < n; ++j) {

                if (s.charAt(i) == s.charAt(j)) {

                    curr[j] = prev[j - 1] + 2;
                } else {

                    curr[j] = Math.max(prev[j], curr[j - 1]);
                }
            }

            prev = curr.clone();
        }

        return curr[n - 1];
    }

    public static void main(String[] args) {
        String s = "bbabcbcab";
        System.out.println(longestPalinSubseq(s));
    }
}