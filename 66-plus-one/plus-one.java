class Solution {
    public int[] plusOne(int[] digits) {
        int [] arr = new int[digits.length + 1];

        for(int i = digits.length -1 ; i>=0; i--){
            if(digits[i] < 9 || digits[i] == 0){
                digits[i] += 1;
                return digits;
            } else if(digits[i] == 9){
                digits[i] = 0;
            }
        }
        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;
        return newArr;
    }
}