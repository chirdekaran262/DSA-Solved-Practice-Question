package Recurssion;

import static Recurssion.StringSkip.skipapple;

public class StringSkip {
    public static void main(String[] args) {
        String s="shkfhajdfhjk";
        System.out.println(Skip(s));
        skip2("","sncjfdjhfbhskfj");
        System.out.println(skip3("kahjhjhaxksklsdk"));
        System.out.println(skipapple("sapplejhjapplejghsgapple"));
        System.out.println(skipAppNotApple("sappleappjhjapplejghappsgapple"));

    }
    static int i=0;
    static String k="";
    public static String Skip(String s){
        if(i<s.length()){
            if(s.charAt(i)!='h'){
                k=k+s.charAt(i);
            }
            i++;
            return Skip(s);
        }
        return k;
    }
    //Another approch to skip the charcter
    public static void skip2(String S,String K){
        if(K.isEmpty()){
            System.out.println(S);
            return;
        }
        char ch=K.charAt(0);
        if(ch=='h'){
            skip2(S,K.substring(1));
        }
        else{
            skip2(S+ch,K.substring(1));
        }
    }
    public static String skip3(String k){
        if(k.isEmpty()){
            return k;
        }
        char ch=k.charAt(0);
        if(ch=='h'){
            return skip3(k.substring(1));
        }
        else{
            return ch+skip3(k.substring(1));
        }
    }
    public static String skipapple(String s){
        if(s.isEmpty()){
            return s;
        }
        if(s.startsWith("apple")){
            return skipapple(s.substring(5));
        }
        else{
            return s.charAt(0)+skipapple(s.substring(1));
        }
    }
    public static String skipAppNotApple(String s){
        if(s.isEmpty()){
            return s;
        }
        if(s.startsWith("app") && !s.startsWith("apple")){
            return skipAppNotApple(s.substring(3));
        }
        else{
            return s.charAt(0)+skipAppNotApple(s.substring(1));
        }
    }
}
