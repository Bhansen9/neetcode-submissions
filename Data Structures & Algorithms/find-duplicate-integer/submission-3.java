class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for(int i = 0; nums.length > i; i++){
            if(seen.contains(nums[i])){
                return nums[i];
            }else{
                seen.add(nums[i]);
            }
        }
        return -1;
    }
}
