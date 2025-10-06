class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int strow = 0;
        int enrow = n - 1;
        int stcol = 0;
        int encol = n - 1;
        int k = 1;

        while (strow <= enrow && stcol <= encol) {
            //top
            for (int j = stcol; j <= encol; j++) {
                arr[strow][j] = k++;
            }
            //right
            for (int i = strow + 1; i <= enrow; i++) {
                arr[i][encol] = k++;
            }
            //botton
            if (strow != enrow) {
                for (int j = encol - 1; j >= stcol; j--) {
                    arr[enrow][j] = k++;
                }
            }
            //left
            if (stcol != encol) {
                for (int i = enrow - 1; i >= strow + 1; i--) {
                    arr[i][stcol] = k++;
                }
            }

            strow++;
            stcol++;
            encol--;
            enrow--;
        }

        return arr;
    }
}