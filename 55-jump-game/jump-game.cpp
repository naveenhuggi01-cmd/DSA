class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n=nums.size();
        int maxreachable=nums[0];
        for(int i=1;i<n;i++){
            if(maxreachable<i)
            return false;
            maxreachable=max(maxreachable, nums[i]+i);
            if(maxreachable >= n-1)
            return true;
        }
        return true;
    }
};