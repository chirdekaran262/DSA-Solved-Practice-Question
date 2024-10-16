import java.text.DecimalFormat;
import java.util.Random;
import java.util.random.*;;

public class StringB {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer(20);
        StringBuffer sb3 = new StringBuffer("Karan chirde");
        System.out.println(sb3);
        System.out.println(sb1.capacity());
        sb.append("Hello world!");
        sb.insert(5, " karan");
        sb.replace(11, 16, " ");
        sb.delete(11, 13);
        sb.reverse();
        String str = sb.toString();
        System.out.println(str);

        Random r = new Random();
        System.out.println(r.nextFloat());
        System.out.println((char) r.nextFloat());
        RandomString rs = new RandomString();
        System.out.println(rs.RString(20));

        rs.Split();

        // Format the number
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(23.9));

        // Remove White Space
        String s = new String();
        s = "jf djs  kd  d s";
        System.out.println(s);

        System.out.println(s.replaceAll("\\s", ""));
    }
}
