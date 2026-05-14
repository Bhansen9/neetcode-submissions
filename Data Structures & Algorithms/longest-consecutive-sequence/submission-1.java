class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums){
            seen.add(num);
        }
        int longest_consecutive = 0;
        if (nums.length > 0) longest_consecutive = 1;
        for (int num : seen){
            if(!seen.contains(num - 1)){
                int currentNum = num;
                int currentLength = 1;
            while(seen.contains(currentNum + 1)){
                currentNum++;
                currentLength++;
            }
            if(currentLength > longest_consecutive){
                longest_consecutive = currentLength;
            }
        }
    }
    return longest_consecutive;
}
}
