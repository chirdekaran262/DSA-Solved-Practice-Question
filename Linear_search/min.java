public class min {
    public static void main(String[] args) {
        int[] a={20,48,68,23,45,90,17,34};
        int  n=a.length;
        int min=a[0];
        for(int i=0;i<n;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("Minimum Element from the array is: "+min);
    }
}
