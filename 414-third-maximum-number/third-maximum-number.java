class Solution {
    public int thirdMax(int[] nums) {

        int min = 0;

        Arrays.sort(nums);

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }

        int[] result = Arrays.copyOf(nums, k);

        if(result.length >= 3){
            min =  result[result.length - 3];
        }else if (result.length < 3){
        min =  result[result.length -1];
        }

        return min;
    }
}