class Solution {
    public int maxProfit(int[] prices) {
        int minP=Integer.MAX_VALUE;
        int mProfit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            minP=Math.min(minP,prices[i]);
            int profit=prices[i]-minP;
            mProfit=Math.max(mProfit,profit);
        }
        return mProfit;
        
    }
}