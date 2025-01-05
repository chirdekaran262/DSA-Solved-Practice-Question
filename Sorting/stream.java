public class stream {
    public static void main(String[] args) {
        skip("abbcadebead","");
        System.out.println(skip("aabcaacccb"));
        skipString("aabcappleaccapplecappeb","");
    }
    static void skip(String s,String ans) {
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(0);
        if(ch=='a'){
            skip(s.substring(1),ans);
        }
        else {
            skip(s.substring(1),ans+ch);
        }
    }
    static String skip(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch=s.charAt(0);
        if(ch=='a'){
            return skip(s.substring(1));
        }
        else{
            return ch+skip(s.substring(1));
        }
    }
    static void skipString(String s,String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return ;
        }
        char ch=s.charAt(0);
        if(s.startsWith("apple")){
            skipString(s.substring("apple".length()),ans);
        }
        else{
            skipString(s.substring(1),ans+ch);
        }
    }
}
