class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean result = false;

        for(int right = 0; right < s.length(); right++){
            char current = s.charAt(right);
            if(current == '(' || current == '{' || current == '['){
                stack.push(current);
            }
                if(current ==')'){
                    if(stack.isEmpty() || stack.peek() != '('){
                        return false;
                    } else{
                    stack.pop();
                    }
                }
                if(current == '}'){
                    if(stack.isEmpty() || stack.peek() != '{'){
                        return false;
                    }else{
                        stack.pop();
                    }
                }
                if(current == ']'){
                    if(stack.isEmpty() ||stack.peek() != '['){
                        return false;
                    }else{
                        stack.pop();
                    }
                }

            }
    return stack.isEmpty();
    }
}
