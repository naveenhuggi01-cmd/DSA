class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int maxreachable=nums[0];
        for(int i=1;i<nums.length;i++){
            if(maxreachable<i)
            return false;
            maxreachable=Math.max(maxreachable, nums[i]+i);
            if(maxreachable >= n-1)
            return true;
        }
        return true;
    }
}