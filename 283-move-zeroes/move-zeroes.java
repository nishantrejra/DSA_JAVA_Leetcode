class Solution {
    public void moveZeroes(int[] nums) {
        int position = 0;
        for(int e : nums){
            if(e!=0){
                nums[position++]=e;
            }
        }
        
        while(position <nums.length){
            nums[position++] = 0;
        }
    }
}