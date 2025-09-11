class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0, right = (n * m) - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midVal = matrix[mid / m][mid % m];

            if (target == midVal) {
                return true;
            } else if (target > midVal) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;

    }
}

/* Brute_Froce_Solution
 class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i<matrix.length ; i++){
            for(int j = 0; j<matrix[0].length;j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
} */