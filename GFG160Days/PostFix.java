import java.util.*;

class PostFix {
    public int evaluate(String[] arr) {
        // code here
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            
            if(arr[i].equals("*")||arr[i].equals("-")||arr[i].equals("+")||arr[i].equals("/")){
                if(!stack.isEmpty()){
                    int e2=stack.pop();
                    int e1=stack.pop();
 
                    if(arr[i].equals("+")){
                        stack.push(e1+e2);
                    }
                    else if(arr[i].equals("-")){
                        stack.push(e1-e2);
                    }
                    else if(arr[i].equals("*")){
                        stack.push(e1*e2);
                    }
                    else if(arr[i].equals("/")){
                        stack.push(e1/e2);
                    }
                }
            }
            else{
                stack.push(Integer.parseInt(arr[i]));
            }
        }
        return  stack.peek();
    }
    public static void main(String[] args) {
        PostFix pf = new PostFix();
        String[] expression = {"2", "1", "+", "3", "*"};
        System.out.println(pf.evaluate(expression));  // Output: 9
    }
}