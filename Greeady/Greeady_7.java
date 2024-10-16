package Greeady;
import java.util.*;

public class Greeady_7 {
    static class JOB{
        int id;
        int deadline;
        int value;

        public JOB(int i,int d,int v){
            deadline=i;
            value=v;
            id=i;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][]={{1,34},{3,45},{2,43},{6,54},{4,65}};
        ArrayList<JOB> jobs= new ArrayList<>();
        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new JOB(jobInfo[i][1],jobInfo[i][0],i));
        }
        Collections.sort(jobs,(obj1,obj2)-> obj2.value-obj1.value);
        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            JOB curr=jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("Max jobs= "+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.println(seq.get(i)+" ");
        }
        System.out.println();
    }
}
