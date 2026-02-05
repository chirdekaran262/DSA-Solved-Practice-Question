import java.util.Stack;

public class BalParth {
    public static void main(String[] args) {
       String parentheses="{[()]}";
       System.out.println("Is Balanced: " + isBalanced(parentheses));
    }
    public static boolean isBalanced(String parentheses){
        Stack<Character> stack=new Stack<>();
        for(char ch:parentheses.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;
                char top=stack.pop();
                if((ch==')' && top!='(') || (ch=='}'&& top!='{') || (ch==']' && top!='[')){
                    return false;
                }
            }
    }
    return stack.isEmpty();
    }
}

