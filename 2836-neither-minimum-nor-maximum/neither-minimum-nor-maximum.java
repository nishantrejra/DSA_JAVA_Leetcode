class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);

        int n = -1 ;
        if(nums.length > 2){
            n = nums[1];
        }

        return n;
    }
}