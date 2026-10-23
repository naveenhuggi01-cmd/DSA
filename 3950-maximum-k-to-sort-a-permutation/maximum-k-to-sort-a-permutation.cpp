class Solution {
public:
    int sortPermutation(vector<int>& nums) {
        int missing=-1;
        int n=nums.size();

        for(int i=0;i<n;i++){
            if(nums[i] != i){
                if(missing==-1){
                    missing=nums[i];
                }
                else{
                    missing=missing&nums[i];
                }
            }
        }
        return missing==-1 ? 0 : missing;
    }
};