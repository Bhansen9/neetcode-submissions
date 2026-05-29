class Solution {
    public int search(int[] nums, int target) {
        int result = -1;
        for(int count = 0; count < nums.length; count++){
            if(nums[count] == target){
                result = count;
            }
        }
        return result;
    }
}
