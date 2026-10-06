class Solution {
    public int characterReplacement(String s, int k) {
        int maxFreq=0;
        int maxWl=0;
        int left=0,right=0;
        HashMap<Character,Integer> freqMap=new HashMap<>();
        while(right<s.length()){
            char curr=s.charAt(right);
            freqMap.put(curr,freqMap.getOrDefault(curr,0)+1);
            maxFreq=Math.max(freqMap.get(curr),maxFreq);
            int wL=right-left+1;
            if(wL-maxFreq>k){
                char leftChar=s.charAt(left);
                freqMap.put(leftChar,freqMap.get(leftChar)-1);
                left++;
            }
            maxWl=Math.max(maxWl,right-left+1);
            right++;
        }
        return maxWl;
        
    }
}
