public class num_even {
    public static void main(String[] args) {
        int[] a={203,45490342,5675,786,5675,877,555555};
        int n=a.length;
        search(a,n);
    }
    static void search(int a[],int n){
        int j=0,k=0;
        for(int i=0;i<n;i++){
            int num=a[i];
            while(num>0){
                 j=j+1;
                num=num/10;
            }
            if(j%2==0){
                k=k+1;
            }
        }
        System.out.println("Number With Even Digit is : "+k);
    }
}
