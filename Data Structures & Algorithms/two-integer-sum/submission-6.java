class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; nums.length > i; i++){
            int num_needed = target - nums[i];

            if(map.containsKey(num_needed)){
                return new int[] {map.get(num_needed), i};
            }
            
            map.put(nums[i], i);
        }
        return new int[] {-1, 1};
    }
}
