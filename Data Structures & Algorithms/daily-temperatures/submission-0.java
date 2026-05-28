class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for(int current = temperatures.length - 1;current >= 0; current--){
    
            while(!stack.isEmpty() && temperatures[current] >= temperatures[stack.peek()]){
                stack.pop();
                }
            if(stack.isEmpty()){
                result[current] = 0;
            }
            else{
                result[current] = stack.peek() - current;
            }
            stack.push(current);
            }
        return result;
        }
}
