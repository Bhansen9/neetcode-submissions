class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>((a, b) -> b - a);

        if(nums == null){
            return 0;
        }
        for(int num : nums){
            maxQueue.add(num);
        }
        for(int i = 1; i < k; i++){
            maxQueue.poll();
        }
        return maxQueue.poll();
    }
}
