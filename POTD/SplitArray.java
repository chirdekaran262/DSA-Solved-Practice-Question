class SplitArray {
    public boolean canSplit(int arr[]) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int rsum=0;
        for(int i=0;i<arr.length;i++){
            sum-=arr[i];
            rsum+=arr[i];
            if(sum==rsum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        SplitArray sp=new SplitArray();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sp.canSplit(arr)); // true
    }
}