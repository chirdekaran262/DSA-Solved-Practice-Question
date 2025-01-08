public class ATOI {
    public static int myAtoi(String s) {
        // Define the limits for 32-bit signed integer
        int INT_MIN = Integer.MIN_VALUE;
        int INT_MAX = Integer.MAX_VALUE;

        // Remove leading whitespaces
        s = s.trim();

        // Check if the string is empty
        if (s.isEmpty()) {
            return 0;
        }

        // Initialize variables
        int sign = 1;
        int index = 0;
        int result = 0;

        // Check for the sign
        if (s.charAt(0) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(0) == '+') {
            index++;
        }

        // Process each character
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            // Check for overflow or underflow
            if (result > (INT_MAX - digit) / 10) {
                return sign == 1 ? INT_MAX : INT_MIN;
            }

            // Update result
            result = result * 10 + digit;
            index++;
        }

        // Apply the sign and return the result
        return result * sign;
    }

    public static void main(String[] args) {

        System.out.println(myAtoi("   -42")); // Output: -42

    }
}
