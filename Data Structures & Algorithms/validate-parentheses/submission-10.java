class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; s.length() > i; i++){
            Character current = s.charAt(i);
            if(current == '(' || current == '{' || current == '['){
                stack.push(current);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                Character top = stack.peek();
                if(current == ')' && top == '('){
                    stack.pop();
                }
                else if(current == '}' && top == '{'){
                    stack.pop();
                }
                else if(current == ']' && top == '['){
                    stack.pop();
                } 
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
