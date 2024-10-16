package Greeady;
import java.util.*;

public class Greeady_5 {
    public static void main(String[] args) {
        int pair[][]={{3,4},{8,5},{1,3},{5,2},{4,6},{4,1},{4,7}};

        Arrays.sort(pair,Comparator.comparingDouble(o->o[1]));
        int chain=1;
        int chainend=pair[0][1];

        for(int i=1;i<pair.length;i++){
            if(pair[i][0]>chainend){
                chain++;
                chainend=pair[i][1];
            }
        }
        System.out.println("Maximum Length of pair is: "+chain);
    }
}
