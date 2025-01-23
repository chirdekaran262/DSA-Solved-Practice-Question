
import java.util.Arrays;

class AggreCow{
    public static void main(String[] args) {
        int[] a={1, 2, 4, 8, 9};
        int k=3;
        System.out.print("Answer: "+aggressiveCows(a,k));
    }
    public static boolean check(int[] stalls,int k,int mid){
        int c=1;
        int prev=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-prev>=mid){
                prev=stalls[i];
                c++;
            }
        }
        return (c>=k);
    }
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int res=0;
        int lo=1;
        int hi=stalls[stalls.length-1]-stalls[0];
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(check(stalls,k,mid)){
                res=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return res;
    }
}