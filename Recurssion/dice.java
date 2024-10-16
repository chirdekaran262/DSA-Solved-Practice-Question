package Recurssion;

import java.util.ArrayList;
import java.util.List;

public class dice {
    public static void main(String[] args) {
        dicecount("",4);
        System.out.println(dicecountL("",4));
    }
    public static void dicecount(String word, int n) {
        if(n==0){
            System.out.println(word);
            return;
        }
        for(int i=1;i<=6 && i<=n;i++){
            dicecount(word+i,n-i);
        }
    }
    public static List<String> dicecountL(String word, int n) {
        if(n==0){
            List<String> l=new ArrayList<>();
            l.add(word);
            return l;
        }

        List<String> l=new ArrayList<>();
        for(int i=1;i<=6&&i<=n;i++){
          l.addAll(dicecountL(word+i,n-i));
        }

        return l;
    }
}
