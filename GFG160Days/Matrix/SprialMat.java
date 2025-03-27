import java.util.ArrayList;

public class SprialMat {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int left=0,right=mat[0].length-1;
        int top=0,bottom=mat.length-1;
        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++){
                list.add(mat[top][j]);
            }
            top++;
            for(int j=top;j<=bottom;j++){
                list.add(mat[j][right]);
            }
            right--;
            if(top<=bottom){
            for(int j=right;j>=left;j--){
                list.add(mat[bottom][j]);
            }
             bottom--;
            }
            if(left<=right){
            for(int j=bottom;j>=top;j--){
                list.add(mat[j][left]);
                
            }
            left++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };
        SprialMat obj=new SprialMat();
        ArrayList<Integer> res = obj.spirallyTraverse(mat);

        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
 