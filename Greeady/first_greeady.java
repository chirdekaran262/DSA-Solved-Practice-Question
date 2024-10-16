package Greeady;
import java.util.*;

public class first_greeady {
    public static void main(String[] args) {
        int start[]={0,3,5,2,6,3,8};
        int end[]={1,4,6,7,8,8,9};

        int maxact=0;
        ArrayList<Integer> ans=new ArrayList<>();

        maxact=1;
        ans.add(0);
        int lastend=end[0];
        for(int i=0;i<end.length;i++){
            if(start[i]>= lastend){
                maxact++;
                ans.add(i);
                lastend=end[i];
            }
        }
        System.out.println("Max Activites is: "+maxact);
        for(int  i=0;i<ans.size();i++){
            System.out.println("A"+ans.get(i)+" ");
        }
        System.out.println( );
    }
}
