class kthMinMiss{
    public static void main(String[] args) {
        int[] arr={2, 3, 4, 7, 11};
        int k = 5;
        System.out.println("Answer: "+kthMissing(arr, k));
    }
    public static int kthMissing(int[] arr, int k) {
        // code here
        int n=arr.length;
       for(int i=0;i<n;i++){
           if(arr[i]>(k+i)){
               return (k+i);
           }
       }
       return k+n;
    }
}