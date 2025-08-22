class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int n = 0 ;
        if(nums.length > 2){
            n = nums[1];
        }else if(nums.length == 2 || nums.length == 1){
            n = -1;
        }

        return n;
    }
}