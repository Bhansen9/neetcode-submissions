class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int total = 0;

        int leftmax = 0;
        int rightmax = 0;
        while(left < right){
            if(height[left] <= height[right]){
                leftmax = Math.max(leftmax, height[left]);
                total += leftmax - height[left];
                left++; 
            }else{
                rightmax = Math.max(rightmax, height[right]);
                total += rightmax - height[right];
                right--;
            }
        }
        return total;
    }
}
