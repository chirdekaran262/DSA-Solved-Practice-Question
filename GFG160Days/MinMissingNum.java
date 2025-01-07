public class MinMissingNum {
    public static void main(String[] args) {
        int[] arr={2, -3, 4, 1, 1, 7};
        System.out.println("Answer: "+minNum(arr));
    }
    static int minNum(int[] arr){
        int num=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num&&num>=1){
                num++;
            }
        }
        return num;
    }
}
