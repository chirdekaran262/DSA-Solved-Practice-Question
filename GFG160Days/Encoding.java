import java.util.*;
class  Encoding {
    static String decodeString(String s) {
        // code here
        Stack<Character> stack=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            
            
            if(s.charAt(i)!=']'){
                stack.push(s.charAt(i));
            }
            else{
                StringBuilder temp=new StringBuilder();
                while(stack.peek()!='['){
                    temp.insert(0,stack.pop());
                }
                stack.pop();
                StringBuilder numstr=new StringBuilder();
                while(!stack.isEmpty()&& Character.isDigit(stack.peek())){
                    numstr.insert(0,stack.pop());
                }
                int times=Integer.parseInt(numstr.toString());
                String repeated=temp.toString().repeat(times);
                for(char ch:repeated.toCharArray()){
                    stack.push(ch);
                }
            }
        }
        for(char ch:stack){
            res.append(ch);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String encoded = "3[a2[c]]";
        String decoded = decodeString(encoded);
        System.out.println(decoded);
    }
}