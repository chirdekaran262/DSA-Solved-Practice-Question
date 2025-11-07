// Java program to partition a Set 
// into Two Subsets of Equal Sum
// using top up approach 
class EqualPartition {

    static boolean equalPartition(int[] arr) {
        
        // Calculate sum of the elements in array
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int n = arr.length;

        // If sum is odd, there cannot be two 
        // subsets with equal sum
        if (sum % 2 != 0) 
            return false;

        sum = sum / 2;

        // Create a 2D array for storing results
        // of subproblems
        boolean[][] dp = new boolean[n + 1][sum + 1];

        // If sum is 0, then answer is true (empty subset)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Fill the dp table in bottom-up manner
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j < arr[i - 1]) {
                  
                    // Exclude the current element
                    dp[i][j] = dp[i - 1][j];
                } else {
                  
                    // Include or exclude
                    dp[i][j] = dp[i - 1][j] || 
                    dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 5};
        if (equalPartition(arr)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}