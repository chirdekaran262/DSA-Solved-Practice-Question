import java.util.Random;

public class RandomString {
    public String RString(int size) {
        StringBuffer s = new StringBuffer();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomchar = 97 + (int) (random.nextFloat() * 26);
            s.append((char) randomchar);
        }
        return s.toString();
    }

    // Split
    public void Split() {
        String st = "Karan Prabhakar Chirde";
        String[] s = st.split(" ");
        System.out.println(s);
    }
}
