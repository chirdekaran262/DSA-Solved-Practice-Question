public class FlipImage {
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 1, 1},
                {0, 1, 0, 1},
                {1, 1, 0, 1}};
        flip(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

    }
    public static void flip(int[][] arr) {
        for(int[] r:arr){
            for(int i=0;i<arr.length-1-i;i++){
                int temp=r[i]^1;
                r[i]=r[arr.length-i-1]^1;
                r[arr.length-i-1]=temp;
            }
        }

    }
}
