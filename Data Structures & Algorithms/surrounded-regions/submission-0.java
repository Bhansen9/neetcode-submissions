class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        for(int row = 0; rows > row; row++){
            dfs(board, row, 0);
            dfs(board, row, cols - 1);
        }

        for(int col = 0; cols > col; col++){
            dfs(board, 0, col);
            dfs(board, rows - 1, col);
        }
        for(int row = 0; rows > row; row++){
            for(int col = 0; cols > col; col++){
                if(board[row][col] == 'O'){
                    board[row][col] = 'X';
                } else if(board[row][col] == 'S'){
                    board[row][col] = 'O';
                }
            }
        }
    }
    private void dfs(char[][] board, int row, int col){
        if(row<0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != 'O'){
            return;
        }
        board[row][col] = 'S';

        dfs(board, row, col+1);
        dfs(board, row, col-1);
        dfs(board, row+1, col);
        dfs(board, row-1, col);
    }
}
