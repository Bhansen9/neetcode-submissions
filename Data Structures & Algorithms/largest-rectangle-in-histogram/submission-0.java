class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();

        int maxArea = 0;

        for(int i = 0; heights.length >= i; i++){
            int currentheight;
            if (i == heights.length){
                currentheight = 0;
            } else{
                currentheight = heights[i];
            }
            while(!stack.isEmpty() && currentheight < heights[stack.peek()]){
                int height = heights[stack.pop()];

                int width;

                if(stack.isEmpty()){
                    width = i;
                } else{
                    width = i - stack.peek() - 1;
                }

                maxArea = Math.max(maxArea, height * width);


            }
            stack.push(i);

        }
        return maxArea;
    }
}
