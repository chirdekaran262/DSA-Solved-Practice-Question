package Array_string;
import java.util.*;
class Solution
{
    public static void  Addition(int[][] matrixA, int[][] matrixB)
    {
          for(int i=0;i<matrixA.length;i++){
            for(int j=0;j<matrixB.length;j++){
                matrixA[i][j]=matrixA[i][j]+matrixB[i][j];
             }
            
        }
        System.out.println("Resultant Matrix:");
        for (int[] row : matrixA) {
            System.out.println(Arrays.toString(row));
        }
        
    }
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrixB = {
            {7, 8, 9},
            {10, 11, 12}
        };
        Addition(matrixA, matrixB);
       
    }
}
