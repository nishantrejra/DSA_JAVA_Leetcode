class Solution {

    static int count = 0;

    public int totalNQueens(int n) {
        count = 0;
        char[][] board = new char[n][n];
        for(int i =0 ; i < n ; i++){
            for(int j =0 ; j < n ;j++){
                board[i][j]='.';
            }
        }
        queen(board, 0);
        return count;
    }


    static void queen(char[][] board, int row){
        if(row == board.length){
            count++;
            return;
        }
        for(int j = 0 ; j < board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                queen(board, row+1);
                board[row][j] = '.';
            }
        }
    }
    static boolean isSafe(char[][] board, int row, int col){
        //v
        for(int i = row-1 ; i >= 0 ; i--){
            if(board[i][col]== 'Q'){
                return false;
            }
        }

        //d l
        for(int i = row-1, j = col-1 ; i >= 0 && j >= 0 ; i--, j--){
            if(board[i][j]== 'Q'){
                return false;
            }
        }

        //d r
        for(int i = row-1, j = col+1 ; i >= 0 && j < board.length ; i--, j++){
            if(board[i][j]== 'Q'){
                return false;
            }
        }

        return true;
    }

}