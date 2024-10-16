package Greeady;
import java.lang.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Greeady_3 {
    public static void main(String[] args) {
        int value[]={2,5,3,7,4,8,3};
        int weight[]={3,4,2,6,9,3,2};
        int w=15;

        double ratio[][]=new double[value.length][2];
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/weight[i];
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int capacity=w;
        int finalval=0;
        for(int i=0;i<value.length;i++){
            int idx= (int)ratio[i][1];
            if(capacity>=ratio[idx][1]){
                capacity-=weight[i];
                finalval+=value[i];
            }
            else{
                finalval+=(ratio[i][1]*capacity);
                break;
            }
        }

        System.out.print("Total value of capacity "+w+" is "+finalval);

    }
}
