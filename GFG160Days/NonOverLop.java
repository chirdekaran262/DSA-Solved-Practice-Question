import java.util.Arrays;

class NonOverLop{
    static int minRemoval(int intervals[][]) {
        // code here
        int c=0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int e=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<e){
                c++;
                
            }
            else{
                e=intervals[i][1];
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 5}, {1, 4}};
        System.out.println(minRemoval(intervals));
    }
}