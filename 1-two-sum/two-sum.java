class Solution {
    public int[] twoSum(int[] arr, int tar) {

        HashMap<Integer,Integer> m=new HashMap<>();
        int[] ans=new int[2];

        for(int i=0;i<arr.length;i++){
            int first=arr[i];
            int sec=tar-first;

            if(m.containsKey(sec)){
                ans[0]=i;
                ans[1]=m.get(sec);
                return ans;
            }

            m.put(first,i);
        }
        return ans;
    }
}