class Solution {
    public int evalRPN(String[] tokens) {
         
        Stack<Integer> stack = new Stack<>();
        for(String token:tokens){
            if(token.equals("+")|| token.equals("-")|| token.equals("*")|| token.equals("/")){
                int t1 = stack.pop();
                int t2 = stack.pop();

                if(token.equals("+")){
                    stack.push(t2+t1);
                }
                else if(token.equals("-")){
                    stack.push(t2-t1);
                }
                else if(token.equals("*")){
                    stack.push(t2*t1);
                }
                else if(token.equals("/")){
                    stack.push(t2/t1);
                }
            }
                
                else{
                    stack.push(Integer.parseInt(token));
                }
            }
        return stack.pop();

    }
}