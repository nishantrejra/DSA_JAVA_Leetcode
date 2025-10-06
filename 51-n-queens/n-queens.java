class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] chessBoard = new char[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                chessBoard[i][j] = '.';
            }
        }

        List<List<String>> ans = new ArrayList<>();
        nQueens(chessBoard, 0 , ans);
        return ans;
    }

    static void nQueens(char[][] chessBoard, int row, List<List<String>> list){
        if(row == chessBoard.length){
            list.add(create(chessBoard));
            return;
        }
        for(int col = 0 ; col < chessBoard.length; col++ ){
            if(isSafe(chessBoard, row, col)){
                chessBoard[row][col] = 'Q';
                nQueens(chessBoard, row+1,list);
                chessBoard[row][col] = '.';
            }
        }
    }

    static List<String> create(char[][] chessBoard){
        List<String> horizontal = new ArrayList<> ();
        for(int i = 0 ; i< chessBoard.length; i++){
            String row = new String(chessBoard[i]);
            horizontal.add(row);
        }
        return horizontal;
    }

    static boolean isSafe(char[][] chessBoard, int row, int col){
        //vertical
        for(int i = row -1 ; i >= 0 ; i--){
            if(chessBoard[i][col] == 'Q'){
                return false;
            }
        }

        //diag left
        for(int i = row -1, j = col -1 ; i >= 0 && j >= 0 ; i--, j--){
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
        }

        //diag right
        for(int i = row -1, j = col +1 ; i >= 0 && j < chessBoard.length ; i--, j++){
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

}