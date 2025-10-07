class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, 0,0);
        return ;
    }
    public static boolean solve(char[][] board, int row, int col){
        if(row == 9){
            print(board);
            return true;
        }

        int rowNext = row, colNext = col+1;
        if(col+1 == 9){
            rowNext = row+1;
            colNext = 0;
        }

        if(board[row][col] != '.'){
            return solve(board, rowNext, colNext);
        }

        for(char digit = '1' ; digit <= '9' ; digit++){
            if(isSafe(board, row, col, digit)){
                board[row][col] = digit;
                if(solve(board, rowNext, colNext)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    public static boolean isSafe(char[][]board, int row, int col, int digit){
        //row
        for(int i = 0 ; i < 9 ; i++){
            if(board[i][col] == digit){
                return false;
            }
        }

        //col
        for(int i = 0 ; i < 9 ; i++){
            if(board[row][i] == digit){
                return false;
            }
        }

        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;

        for(int i = sr; i< sr+3; i++){
            for( int j = sc; j< sc+3 ; j++){
                if(board[i][j]== digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static void print(char[][] board){
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                System.out.print(board[i][j]+",");
            }
            System.out.println();
        }
    }
}