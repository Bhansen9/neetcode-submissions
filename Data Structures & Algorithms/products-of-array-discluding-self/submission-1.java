class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int prefix = 1;



        for(int i = 0; nums.length > i; i++){
            output[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;

        for(int i = nums.length -1; i >= 0; i--){
            output[i] *= suffix;
            suffix *= nums[i];

        }
        return output;
    }
}  
