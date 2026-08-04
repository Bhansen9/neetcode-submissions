class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> seen = new HashSet<>();
       boolean result = false;
       for(int i = 0;nums.length > i; i++){
            if(seen.contains(nums[i])){
                result = true;
            }
            if(!seen.contains(nums[i])){
                seen.add(nums[i]);
            }
       }
       return result;
    }
}