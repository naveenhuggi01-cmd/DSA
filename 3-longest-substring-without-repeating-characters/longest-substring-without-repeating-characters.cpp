class Solution {
public:
    int lengthOfLongestSubstring(string s) {
      unordered_set<char> seen;
        int maxLen=0;
        int left=0;
        for(int right=0; right < s.length(); right++){
            char ch=s[right];
            while(seen.count(ch)){
                seen.erase(s[left]);
                left++;
            }
            seen.insert(ch);
            int len=right-left+1;
            maxLen=max(maxLen,len);
        }
        return maxLen;
    }
};