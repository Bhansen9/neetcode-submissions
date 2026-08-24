class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for(int i = 0; nums.length > i;i++){
            if(!seen.contains(nums[i])){
                seen.add(nums[i]);
            } else{
                return true;
            }
        }
        return false;
    }
}