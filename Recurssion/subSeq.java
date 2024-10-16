package Recurssion;

import java.util.ArrayList;

public class subSeq {
    public static void main(String[] args) {
        ss("abc","");
        System.out.println(subseqa("","abc"));
        subSeqAscii("","abc");
    }
    public static void ss(String s,String t){
        if(s.isEmpty()){
            System.out.println(t);
            return;
        }
        char ch=s.charAt(0);
        ss(s.substring(1),t+ch);
        ss(s.substring(1),t);
    }
    static ArrayList<String> subseqa(String s,String r){
        if(r.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(s);
            return  list;
        }
        char ch=r.charAt(0);
        ArrayList<String> l=subseqa(s+ch,r.substring(1));
        ArrayList<String> ri=subseqa(s,r.substring(1));
        l.addAll(ri);
        return l;
    }
    public static void subSeqAscii(String k,String l){
        if(l.isEmpty()){
            System.out.println(k);
            return;
        }

        char ch=l.charAt(0);
        subSeqAscii(k,l.substring(1));
        subSeqAscii(k+ch,l.substring(1));
        subSeqAscii(k+(ch+0),l.substring(1));
    }

}
