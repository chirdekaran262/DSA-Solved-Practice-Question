class PositionoftheSetBit {
    public int findPosition(int n) {
        // code here
        if(n == 0) return -1;
        if((n & (n - 1)) != 0) return -1;
        int exponent = (int)((Math.log(n) / Math.log(2)));
        return exponent + 1;
    }
    public static void main(String[] args) {
        PositionoftheSetBit obj = new PositionoftheSetBit();
        int n = 16;
        System.out.println(obj.findPosition(n));
    }
}