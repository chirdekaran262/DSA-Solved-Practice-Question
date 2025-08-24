import java.util.*;

class Solution {
    static boolean isBalanced(String s) {
        // code here
        Stack<Character> st=new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top=st.pop();
                if( (c==')' && top!='(' )||(c==']' && top!='[')||(c=='}' && top!='{')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
         System.out.println(isBalanced("(){}[]"));   // true
        System.out.println(isBalanced("([{}])"));   // true
        System.out.println(isBalanced("(]"));       // false
        System.out.println(isBalanced("({[)]}"));   // false
    }
}