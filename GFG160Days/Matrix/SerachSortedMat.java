class SerachSortedMat {
    public static boolean binarySearch(int mat[],int x){
        int low=0,high=mat.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mat[mid]==x){
                return true;
            }
            else if(mat[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        for(int i=0;i<mat.length;i++){
            if(binarySearch(mat[i],x)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] mat = {{3, 30, 38},
                       {20, 52, 54},
					   {35, 60, 69}};
        int x = 35;
        
        if(matSearch(mat, x)) 
            System.out.println("true");
        else 
            System.out.println("false");
    }
}