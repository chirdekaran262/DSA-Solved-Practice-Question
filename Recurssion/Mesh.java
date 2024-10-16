package Recurssion;

import java.util.ArrayList;
import java.util.Arrays;

public class Mesh {
    public static void main(String[] args) {
        System.out.println(MeshC(3,3));
        MeshP("",3,3);
        System.out.println(MeshA("",3,3));
        boolean[][] mesh={{true,true,true},
                {true,false,true},
                {true,true,true}};
        PathRestriction("",mesh,0,0);
        int[][] path=new int[mesh.length][mesh[0].length];
        Allpathprint("",mesh,0,0,path,1);
    }
    public static int MeshC(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int right=MeshC(r,c-1);
        int down=MeshC(r-1,c);
        return right+down;
    }
    public static void MeshP(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);

            return;
        }
        if(r>1){
            MeshP(p+'D',r-1,c);
        }
        if(c>1){
            MeshP(p+'R',r,c-1);
        }
    }
    public static ArrayList<String> MeshA(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> a=new ArrayList<>();
            a.add(p);
            return a;
        }
        ArrayList<String> l=new ArrayList<>();
        if(r>1 && c>1){
            l.addAll(MeshA(p+'D',r-1,c-1));
        }
        if(r>1) {
            l.addAll(MeshA(p+'H',r-1,c));
        }
        if(c>1){
            l.addAll(MeshA(p+'V',r,c-1));
        }
        return l;
    }
    public static void PathRestriction(String p,boolean[][] mesh,int r,int c){
        if(r== mesh.length-1 && c==mesh[0].length-1){
            System.out.println(p);
            return;
        }
        if(!mesh[r][c]){
            return;
        }
        if(r<mesh.length-1){
            PathRestriction(p+'D',mesh,r+1,c);
        }
        if(c<mesh[0].length-1){
            PathRestriction(p+'R',mesh,r,c+1);
        }
    }
    public static void Back(String p,boolean[][] mesh,int r,int c){
        if(r== mesh.length-1 && c==mesh[0].length-1){
            System.out.println(p);
            return;
        }
        if(!mesh[r][c]){
            return;
        }
        mesh[r][c]=false;
        if(r<mesh.length-1){
            Back(p+'D',mesh,r+1,c);
        }
        if(c<mesh[0].length-1){
            Back(p+'R',mesh,r,c+1);
        }
        if(r>0){
            Back(p+'U',mesh,r-1,c);
        }
        if(c>1){
            Back(p+'L',mesh,r,c-1);
        }
        mesh[r][c]=true;
    }

    public static void Allpathprint(String p,boolean[][] mesh,int r,int c,int[][] path,int step){
        if(r== mesh.length-1 && c==mesh[0].length-1){
            for(int[] a:path){
                System.out.println(Arrays.toString(a));
            }
            System.out.println();
            System.out.println(p);
            return;
        }
        if(!mesh[r][c]){
            return;
        }
        mesh[r][c]=false;
        path[r][c]=step;
        if(r<mesh.length-1){
            Allpathprint(p+'D',mesh,r+1,c,path,step+1);
        }
        if(c<mesh[0].length-1){
            Allpathprint(p+'R',mesh,r,c+1,path,step+1);
        }
        if(r>0){
            Allpathprint(p+'U',mesh,r-1,c,path,step+1);
        }
        if(c>1){
            Allpathprint(p+'L',mesh,r,c-1,path,step+1);
        }
        mesh[r][c]=true;
    }
}
