class SearchInMat {
    // Function to search a given number in row-column sorted matrix.
    public static  boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n=mat.length,m=mat[0].length;
        int low=0;
        int high=m*n-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/m;
            int col=mid%m;
            if(mat[row][col]==x){
                return true;
            }
            else if(mat[row][col]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] mat = {{1, 5, 9}, {14, 20, 21}, {30, 34, 43}};
        int x = 14;

        if (searchMatrix(mat, x))
            System.out.println("true");
        else
            System.out.println("false");
    }
}