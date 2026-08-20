class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int count = 0;

        for(int i = 0;grid.length > i; i++){
            for (int j = 0; grid[i].length > j; j++){
                if(grid[i][j] == 1){
                    int temp = callBFS(grid, i, j);
                    if(temp > count){
                        count = temp;
                    }
                }
            }
        }
        return count;
    }
    public int callBFS(int[][] grid, int i, int j){
        if(i<0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0) return 0;

        grid[i][j] = 0;

        int area = 1;

        area += callBFS(grid, i+1, j);
        area += callBFS(grid, i-1, j);
        area += callBFS(grid, i, j+1);
        area += callBFS(grid,i, j-1);

        return area;
    }
}
