package Array_string;

public class DiffOfAscii {
    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
    }
    public static int  scoreOfString(String str) {
        int count = 0;
        for(int i=0; i<str.length()-1; i++) {
            count += Math.abs(str.charAt(i)-str.charAt(i+1));
        }
        return count;
    }
}
