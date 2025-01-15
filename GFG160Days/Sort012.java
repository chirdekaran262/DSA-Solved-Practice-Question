class Sort012{
    public static void main(String[] args) {
        int[] arr={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        System.out.println("Afer sorting zero one two: ");
        sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void sort(int[] arr) {
        // code here
        int zero=0;
        int one=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]==1){
                one++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(zero>0){
                arr[i]=0;
                zero--;
            }
            else if(one>0){
                arr[i]=1;
                one--;
            }
            else{
                arr[i]=2;
            }
        }
    }
}