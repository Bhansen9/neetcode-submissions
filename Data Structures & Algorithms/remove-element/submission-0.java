class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for(int i = 0; nums.length > i; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}