
class PalindromeBinary {
    static long isPallindrome(long N) {
        // code here
         long x = N;
        int len = 0;
        
        while (x > 0) {
            len++;
            x >>= 1;
        }
        
        int i = len - 1, j = 0;
        
        while (i > j) {
            long lBit = (N >> i) & 1;
            long rBit = (N >> j) & 1;
            
            if (lBit != rBit) return 0;
            
            i--; j++;
        }
        
        return 1;
    }

    public static void main(String[] args) {
        PalindromeBinary obj = new PalindromeBinary();
        long N = 9;
        System.out.println(obj.isPallindrome(N));
    }
}