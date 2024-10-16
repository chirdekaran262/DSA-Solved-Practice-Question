public class uniquenum {
    public static void main(String[] args) {
        int[] a={1,3,2,4,1,3,2 };
        System.out.println(ans(a));
    }
    public static int ans(int[] a){
        int u=0;
        for(int n:a){
            u ^= n;
        }
        return u;
    }
}
