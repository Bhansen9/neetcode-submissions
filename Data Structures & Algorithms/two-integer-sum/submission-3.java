class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; nums.length > i; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; nums.length > i; i++){
            int holder = target - nums[i];
            if(map.containsKey(holder) && map.get(holder) != i){
                return new int[] {i, map.get(holder)};
            }
        }
        return new int[]{};
    }
}
