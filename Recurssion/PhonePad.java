package Recurssion;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        pad("","12");
        System.out.println(ArrayListpad("","12"));
        System.out.println(count("","13"));
    }
    public static void pad(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for (int i=(digit-1)*3;i<digit*3;i++) {
            char c=(char)('a'+i);
            pad(p+c,up.substring(1));
        }
    }
    static ArrayList<String> ArrayListpad(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> a=new ArrayList<>();
            a.add(p);
            return a;
        }
        ArrayList<String> l=new ArrayList<>();
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
              l.addAll(ArrayListpad(p+ch,up.substring(1)));
        }
    return l;
    }
    public static int count(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int c=0;
        int digit=(char)('a'+0);
        for(int i=(digit-1)*3;i<3*digit;i++){
            char ch=up.charAt(0);
            c= c+count(p+ch,up.substring(1));
        }
        return c;
    }
}

