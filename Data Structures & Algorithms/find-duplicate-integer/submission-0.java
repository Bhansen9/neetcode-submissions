class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        int dup_num = 0;

            for(int i = 0; nums.length > i; i++){
                if(seen.contains(nums[i])){
                    dup_num = nums[i];
                }
                else{
                    seen.add(nums[i]);
                }
            }
            return dup_num;
    }
}
