public class Power {
    public static void main(String[] args) {
        int b=5;
        int p=4;
        int ans=1;

        while (p>0){
            if((p&1)==1){
                ans*=b;
            }
            b+=b;
            p=p>>1;
        }
        System.out.println(ans);
    }
}
