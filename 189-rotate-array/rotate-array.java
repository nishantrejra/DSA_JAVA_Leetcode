class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int start = 0, end = n-1;

        k = k %n;
        
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
         start = 0;
          end = k-1 ;
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
         start = k;
        end = n-1;
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        

    }

}