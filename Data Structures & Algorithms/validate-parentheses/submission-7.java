class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; s.length() > i; i++){
            char current = s.charAt(i);

            if((current == '(') || (current == '{') || (current == '[')){
                stack.push(current);
            } else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if(current == ')' && top != '('){
                    return false;
                }
                if(current == ']' && top != '['){
                    return false;
                }
                if(current == '}' && top != '{'){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
