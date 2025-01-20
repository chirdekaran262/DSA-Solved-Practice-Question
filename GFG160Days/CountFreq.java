public class CountFreq {
    static int countFreq(int[] arr, int target) {
        // code here
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int a[]={1, 1, 2, 2, 2, 2, 3};
        System.out.println("Answer : "+countFreq(a,2));
    }
}
