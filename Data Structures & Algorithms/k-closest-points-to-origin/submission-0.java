class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (point1,point2) -> Integer.compare(
            distance(point2), 
            distance(point1)
            )
        );

        for (int[] point : points){
            maxHeap.offer(point);

            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        int[][] result = new int[k][2];

        for(int i = 0;k > i; i++){
            result[i] = maxHeap.poll();
        }
        return result;

    }

    private int distance(int[] point){
        int x = point[0];
        int y = point[1];

        return x * x + y * y;
    }
}
