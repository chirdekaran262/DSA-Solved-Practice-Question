public class MatchRoteteStr {
    public static void main(String[] args) {
        String str1="ABCD";
        String str2="BCDA";
        System.out.println("Answer: "+areRotations(str1,str2));
    }
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        String txt=s1+s1;
        String pat=s2;
        int m=txt.length();
        int n=pat.length();
        int len=0;
        int[] lps=new int[n];
        int i=1;
        while(i<n){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else {
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        i=0;
        int j=0;
        while(i<m){
            if(pat.charAt(j)==txt.charAt(i)){
                j++;
                i++;
            }
            if(j==n){
                return true;
            }
            else if(i<m&&pat.charAt(j)!=txt.charAt(i)){
                if(j!=0){
                    j=lps[j-1];
                    
                }
                else{
                    i++;
                }
            }
        }
        return false;
    }
}

