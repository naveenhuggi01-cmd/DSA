class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int tot_pairs=0;
        int n=hours.length;

        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                int sum=hours[i]+hours[j];
                if(sum%24==0){
                    tot_pairs++;
                }
            }
        }
        return tot_pairs;
    }
}