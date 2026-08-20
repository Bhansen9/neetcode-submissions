class Solution {
    public int orangesRotting(int[][] grid) {
        
        Queue<int[]> queue = new LinkedList<>();

        int fresh = 0;

        for(int i = 0; grid.length > i; i++){
            for(int j = 0; grid[i].length > j; j++){
                if(grid[i][j] == 2){
                    queue.offer(new int[]{i,j});
                }
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        int min = 0;

        int[][] directions = {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };
        while(!queue.isEmpty() && fresh > 0){
            int size = queue.size();

            for(int i = 0;i < size; i++){
                int[] current = queue.poll();

                for(int[] direction : directions){
                    int row = current[0] + direction[0];
                    int col = current[1] + direction[1];

                    if(row >= 0 &&
   row < grid.length &&
   col >= 0 &&
   col < grid[row].length &&
   grid[row][col] == 1){
                        grid[row][col] = 2;
                        fresh--;
                        queue.offer(new int[]{row,col});
                }
            }
        }
        min++;
    }
    if(fresh > 0){
        return -1;
    }
    return min;
    }
}
