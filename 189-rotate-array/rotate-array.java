class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int z = 0, o = n-1;

        k = k %n;
        
        while(z<o){
            int temp = nums[z];
            nums[z] = nums[o];
            nums[o] = temp;
            z++;
            o--;
        }
        int i = 0, j = k-1 ;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        int l = k, m = n-1;
        while(l<m){
            int temp = nums[l];
            nums[l] = nums[m];
            nums[m] = temp;
            l++;
            m--;
        }
        

    }
}