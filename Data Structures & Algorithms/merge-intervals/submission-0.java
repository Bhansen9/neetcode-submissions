class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0){
            return new int[0][];
        }
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];

        for(int i = 0; intervals.length > i; i++){
            int[] next = intervals[i];

            if(next[0] <= current[1]){
                current[1] = Math.max(current[1], next[1]);
            }else{
                merged.add(current);
                current = next;
            }
        }
        merged.add(current);
        return merged.toArray(new int[merged.size()][]);
    }
}
