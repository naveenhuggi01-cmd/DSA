class Solution {
    public int sortPermutation(int[] nums) {
        int and=-1;
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                if(and==-1){
                    and=nums[i];
                }
                else{
                    and=and&nums[i];
                }
            }
        }
        return and==-1 ? 0 : and;
    }
}