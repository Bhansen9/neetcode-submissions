class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> freq.get(b) - freq.get(a));
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(nums != null){
                if(freq.containsKey(num)){
                    freq.put(num, freq.get(num) + 1);
                } else{
                    freq.put(num, 1);
                }
            }
        }
        for(int num : freq.keySet()){
            pq.add(num);
        }
        int [] result = new int[k];
        for(int i = 0; i < k; i ++){
            result[i] = pq.poll();
        }
        return result;
    }
}
