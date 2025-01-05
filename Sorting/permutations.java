import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        permute("abc","");
        System.out.println(permuteList("abc","").toString());
    }

    private static ArrayList<String> permuteList(String s1, String s2) {
        if(s1.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(s2);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch=s1.charAt(0);
        for(int i=0;i<=s2.length();i++){
            String f=s2.substring(0,i);
            String s=s2.substring(i);
            ans.addAll(permuteList(s1.substring(1),f+ch+s));
        }
        return ans;
    }

    private static void permute(String s, String p) {
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=s.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String ss=p.substring(i);
            permute(s.substring(1),f+ch+ss);
        }
    }

}
