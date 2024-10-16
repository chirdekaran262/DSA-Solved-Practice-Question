package Array_string;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigINT {
    public static void main(String[] args) {
        BD();
    }

    static void BD() {
        double x = 0.03;
        double y = 0.04;
        // double ans=x-y;
        // System.out.println(ans);
        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal ans = Y.subtract(X);

        BigDecimal a = new BigDecimal("567457865784.75987");
        BigDecimal b = new BigDecimal("7888763476.974587465");
        System.out.println(ans);

        System.out.println(b.add(a));
        System.out.println(b.subtract(a));
        System.out.println(b.multiply(a));
        System.out.println(b.pow(2));
        System.out.println(b.negate());
    }

    static void BI() {
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(a);
        BigInteger B = BigInteger.valueOf(b);

        int c = B.intValue();
        BigInteger C = new BigInteger("7586380447045653");
        BigInteger X = new BigInteger("5897578687304442");

        BigInteger D = BigInteger.TEN;

        BigInteger s = C.add(X);
        BigInteger n = C.multiply(X);

        BigInteger sub = C.subtract(X);
        BigInteger d = C.divide(X);
        BigInteger rem = C.remainder(X);
        System.out.println(d);
        if (X.compareTo(C) > 0) {
            System.out.println("YES");
        }
        System.out.println(FactN.fact(23049));
    }
}
