class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for(int i = 0;nums.length > i; i++){
            if(seen.contains(nums[i])){
                return true;
            } else{
                seen.add(nums[i]);
            }
        }
        return false;
    }
}