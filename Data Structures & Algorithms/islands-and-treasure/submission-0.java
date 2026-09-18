class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();


        for(int i = 0; grid.length > i; i++){
            for(int j = 0; grid[i].length > j; j++){
                if(grid[i][j] == 0){
                    queue.offer(new int[]{i, j});
                }
            }
        }
        bfs(grid, queue);
    }

    public void bfs(int[][] grid, Queue<int[]> queue){
        int[][] directions = {
            {1,0},
            {-1,0},
            {0, 1},
            {0, -1}
        };
        while(!queue.isEmpty()){
            int[] current = queue.poll();

            int row = current[0];
            int col = current[1];

            for(int[] direction : directions){
                int newRow = row + direction[0];
                int newCol = col + direction[1];

                if(newRow < 0 || newRow >= grid.length || newCol < 0 || newCol >= grid[0].length){
                    continue;
                }

                if(grid[newRow][newCol] != Integer.MAX_VALUE){
                    continue;
                }

                grid[newRow][newCol] = grid[row][col] + 1;

                queue.offer(new int[]{newRow, newCol});
            }
        }
    }
}
