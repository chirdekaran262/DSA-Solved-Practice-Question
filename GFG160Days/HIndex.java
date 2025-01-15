public class HIndex {
    public static void main(String[] args) {
        int[] citations={3, 0, 5, 3, 0};
        System.out.print("Answer: "+hIndex(citations));
    }
    public static int hIndex(int[] citations) {
        // code here
        int n=citations.length;
        int[] arr=new int[n+1];
        for(int c:citations){
            if(c>n){
                arr[n]++;
            }
            else{
                arr[c]++;
            }
        }
        int count=0;
        for(int i=n;i>=0;i--){
            count+=arr[i];
            if(count>=i){
                return i;
            }
        }
        return 0;
    }
}
