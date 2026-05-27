class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int count = 0; count < tokens.length; count++){
            String current = tokens[count];
            if(current.equals("+")){
                int left = stack.pop();
                int right = stack.pop();
                stack.push(left + right);
            }
            else if(current.equals("-")){
                int right = stack.pop();
                int left = stack.pop();
                stack.push(left - right);
            }
            else if(current.equals("*")){
                int left = stack.pop();
                int right = stack.pop();
                stack.push(left * right);
            }
            else if(current.equals("/")){
                int right = stack.pop();
                int left = stack.pop();
                stack.push(left / right);
            }
            else{
                stack.push(Integer.parseInt(current));
            }
            }
        return stack.pop();
    }
}
