class Solution {
    public String multiply(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        int a = 0, b = 0;
        String s = "0123456789";
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < 10; j++) {
                if (num1.charAt(i) == s.charAt(j)) {
                    a = a * 10;
                    a = a + i;
                }
            }
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < 10; j++) {
                if (num2.charAt(i) == s.charAt(j)) {
                    b = b * 10;
                    b = b + i;
                }
            }
        }
        int c = a * b;
        String d = "";
        int num = c, temp;
        while (num > 0) {
            temp = num % 10;
            num = num / 10;
            for (int i = 0; i < 10; i++) {
                if (temp == s.charAt(i)) {
                    d = d + s.charAt(i);
                }
            }
        }
        return d;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String ab = s.multiply("123", "456");
        System.out.println(ab);
    }
}