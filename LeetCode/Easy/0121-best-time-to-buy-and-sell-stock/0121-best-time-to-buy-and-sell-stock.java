class Solution {
    public int maxProfit(int[] prices) {
        int minP=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            minP=Math.min(minP,prices[i]);
            int p=prices[i]-minP;
            maxProfit=Math.max(maxProfit,p);
        }
        return maxProfit;
        
    }
}