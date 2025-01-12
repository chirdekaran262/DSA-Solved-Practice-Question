import java.util.ArrayList;

class KMP {

    ArrayList<Integer> search(String pat, String txt) {
        int m = pat.length(); // Length of the pattern
        int n = txt.length(); // Length of the text
        int[] lps = new int[m]; // LPS array to store longest prefix suffix values
        ArrayList<Integer> result = new ArrayList<>();

        // Construct LPS array
        int len = 0; // Length of the previous longest prefix suffix
        lps[0] = 0; // LPS for the first character is always 0
        int i = 1;
        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1]; // Use the previous LPS value to avoid redundant checks
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        // Search for the pattern in the text using KMP algorithm
        i = 0; // Index for text
        int j = 0; // Index for pattern
        while (i < n) {
            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }
            if (j == m) {
                result.add(i - j); // Pattern found at index (i - j)
                j = lps[j - 1]; // Use the LPS value to avoid unnecessary comparisons
            } else if (i < n && txt.charAt(i) != pat.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1]; // Use the LPS value to avoid redundant comparisons
                } else {
                    i++; // Move the text pointer forward if no match is found
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        KMP sol = new KMP();
        String txt = "aabaacaadaabaaba";
        String pat = "aaba";
        ArrayList<Integer> res = sol.search(pat, txt);
        System.out.println(res); // Output: [0, 9, 12]
    }
}
