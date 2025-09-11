class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int count = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[count] != nums[j]){
                count++;
                nums[count] = nums[j];
            }
        }
        return count + 1;
    }
}