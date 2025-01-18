import java.util.ArrayList;


public class InsertInter {
    public static ArrayList<int[]> insertInterval(int[][] intervals,int[] newInterval){
        ArrayList<int[]> res=new ArrayList<>();
        
        int i=0;
        int n=intervals.length;

        while(i<n&& intervals[i][1]<newInterval[0]){
            res.add(intervals[i]);
            i++;
        }

        while(i<n&& intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        res.add(newInterval);
        
        while(i<n){
            res.add(intervals[i]);
            i++;
        }

        return res;
    }
    public static void main(String[] args) {
          int[][] intervals = {{1, 3}, {4, 5}, {6, 7}, {8, 10}};
        int[] newInterval = {5, 6};

        ArrayList<int[]> res = insertInterval(intervals, newInterval);
        for (int[] interval : res) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }
}
