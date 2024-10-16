package Recurssion;

import java.util.ArrayList;

public class linearserach {
    public static void main(String[] args) {
        int[] a={10,2,4,4,2};
        System.out.println(find(a,2,0));
        System.out.println(findindex(a,2,0));
        System.out.println(findindexlast(a,4,a.length-1));
        findallindex(a,4,0);
        System.out.println(findAll(a,2,0,aa));

    }
    public static boolean find(int[] a,int l,int r){
        if(r==a.length){
            return false;
        }
        return a[r]==l || find(a,l,r+1);
    }
    public static int findindex(int[] a,int l,int r){
        if(r==a.length){
            return -1;
        }
        if(a[r]==l){
            return r;
        }
        return findindex(a,l,r+1);
    }
    public static int findindexlast(int[] a,int l,int r){
        if(r==a.length){
            return -1;
        }
        if(a[r]==l){

            return r;
        }
        return findindexlast(a,l,r-1);
    }
    public static ArrayList<Integer> aa=new ArrayList<>();
    public static void findallindex(int[] a, int l, int r){
        if(r==a.length){
            System.out.println(aa);
            return ;
        }
        if(a[r]==l){
            aa.add(l);
        }
            findallindex(a,l,r+1);
    }

    static ArrayList findAll(int[] a, int l, int r,ArrayList<Integer> list){
        if(r==a.length) {
            return list;
        }
        if(a[r]==l){
            list.add(l);
        }
        return findAll(a,l,r+1,list);

    }
}
