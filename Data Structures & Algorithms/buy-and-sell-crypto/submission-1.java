class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,maxProfit=0;
        int cp=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<cp){
                cp=prices[i];
            }
            profit=prices[i]-cp;
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
        
    }
}
