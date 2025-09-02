import java.util.*;
class Solution {
    private Stack<Integer> stack;
    int minEle;
    public Solution() {
        stack=new Stack<>();
        minEle=-1;
    }
    
    
    // Add an element to the top of Stack
    public void push(int x) {
        // code here
        if(stack.isEmpty()){
            stack.push(x);
            minEle=x;
        }
        else if(x<minEle){
            stack.push(2*x-minEle);
            minEle=x;
        }
        else{
            stack.push(x);
        }
    }

    // Remove the top element from the Stack
    public void pop() {
        // code here
        if(stack.isEmpty()){
            return;
        }
        int top=stack.pop();
        if(top<minEle){
            minEle=2*minEle-top;
        }
    }

    // Returns top element of the Stack
        
    public int peek() {
        // code here
        if(stack.isEmpty()){
            return -1;
        }
        int top=stack.peek();
        return (minEle>top)?minEle:top;
    }

        
    // Finds minimum element of Stack
    public int getMin() {
        // code here
        if(stack.isEmpty()){
            return -1;
        }
        return minEle;
    }
    public static void main(String[] args) {
        Solution stack = new Solution();
        stack.push(3);
        stack.push(5);
        System.out.println("Minimum element: " + stack.getMin());
        stack.push(2);
        stack.push(1);
        System.out.println("Minimum element: " + stack.getMin());
        stack.pop();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Minimum element: " + stack.getMin());
    }
}