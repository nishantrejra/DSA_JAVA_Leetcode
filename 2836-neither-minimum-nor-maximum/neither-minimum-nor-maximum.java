class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int n = -1; 
        Arrays.sort(nums);
        min = nums[0];
        max = nums[nums.length-1];
        for(int num : nums){
            if(num != min && num != max){
                n = num;
                break;
            }
        }
        return n;
    }
}