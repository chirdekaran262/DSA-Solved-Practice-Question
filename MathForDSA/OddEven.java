public class OddEven {
    public static void main(String[] args) {
        int n=10;
        System.out.println("Number is Odd "+oddEven(n));
    }
    private static boolean oddEven(int n) {
        return (n&1)==1;
    }
}
