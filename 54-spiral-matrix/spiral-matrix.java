class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int str = 0;
        int stc = 0;
        int enr = matrix.length - 1;
        int enc = matrix[0].length - 1;

        while (str <= enr && stc <= enc) {
            //top
            for (int i = stc; i <= enc; i++) {
                list.add(matrix[str][i]);
            }
            //right
            for (int i = str + 1; i <= enr; i++) {
                list.add(matrix[i][enc]);
            }
            //bottom
            if (str < enr) {
                for (int i = enc - 1; i >= stc; i--) {
                    if (stc == enc)
                        break;
                    list.add(matrix[enr][i]);
                }
            }
            //left
            if (stc < enc) {
                for (int i = enr - 1; i >= str + 1; i--) {
                    if (str == enr)
                        break;
                    list.add(matrix[i][stc]);
                }
            }

            str++;
            stc++;
            enr--;
            enc--;
        }
        return list;
    }
}