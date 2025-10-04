class Solution {
    public int maxArea(int[] height) {
        int maxCount = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length -1;
        while(left<right){
            int maxHeight = Math.min(height[left], height[right]);
            int width = right - left;
            maxCount = Math.max(maxCount, (maxHeight * width));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxCount;
    }
}