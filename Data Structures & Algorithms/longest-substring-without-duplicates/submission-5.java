class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int len=0,maxLen=0;
        int left=0,right=0;
        while(right<s.length()){
            if(set.contains(s.charAt(right))){
                len=right-left;
                maxLen=Math.max(len,maxLen);

                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                left++;
            }
            else{
                set.add(s.charAt(right));  
            }
            right++;
        }
        len=right-left;
        maxLen=Math.max(len,maxLen);
        return maxLen;   
    }
}
