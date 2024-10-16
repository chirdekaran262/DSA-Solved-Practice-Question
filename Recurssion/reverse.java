package Recurssion;

public class reverse {
    public static int sum=0;

    public static void main(String[] args) {
        int num=121;
        reversenum(num);
        if(palindrome(num)){
            System.out.println("it is palindrome");
        }
        else {
            System.out.println("it is not palindrome");
        }
    }

    public static int reversenum(int num) {

        if(num==0){
            System.out.println(sum);

            return sum;
        }
        int rem=num%10;
        sum=sum*10+rem;
        return reversenum(num/10);

    }
    public static boolean palindrome(int num) {
        return num == reversenum(num);
    }
}
