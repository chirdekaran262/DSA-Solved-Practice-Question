package Greeady;
import java.util.*;

public class Greeady_2 {
    public static void main(String[] args) {
        int value[]={6,4,5,6,8};
        int weight[]={2,8,2,9,6};
        int w=12;

        double ratio[][]=new double[value.length][2];

        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int capacity=w;
        int finalval=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx= (int)ratio[i][0];
            if(capacity>=weight[idx]){
                capacity-=weight[idx];
                finalval+=value[idx];
            }
            else{
                finalval+=(ratio[i][1]*capacity);
                break;
            }
        }
        System.out.println("Total profit is: "+finalval);
    }
}
