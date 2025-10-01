class Solution {
public:
    int majorityElement(vector<int>& nums) {
          int n = nums.size();
          int targetsize =  n/2;

          unordered_map<int, int>mpp;

          for(auto it : nums){
             mpp[it]++;
          }

          for(auto it : mpp){ 
            if(it.second > targetsize){
                return it.first;
            }
          }
return -1;
    }
};