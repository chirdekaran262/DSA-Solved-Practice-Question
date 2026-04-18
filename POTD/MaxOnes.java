class MaxOnes {
    int maxOnes(int[] arr) {
        // code here
        int n=arr.length;
        int c=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                c+=1;
            }
        }
        
        int curr=0;
        int m=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                curr+=1;
            }
            else{
                curr-=1;
            }
            if(curr<0){
                curr=0;
            }
            m=Math.max(m,curr);
        }
        return c+m;
    }
    public static void main(String[] args) {
        MaxOnes obj = new MaxOnes();
        int[] arr = {1, 0, 1, 0, 1};
        System.out.println(obj.maxOnes(arr));
        
    }
}