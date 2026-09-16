class Solution {
    public int maxProduct(int[] nums) {
        int maxP=nums[0];
        int minP=nums[0];
        int r=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int n=nums[i];
            int oldMax=maxP;
            int oldMin=minP;
            maxP=Math.max(n,Math.max(oldMax*n,oldMin*n));
            minP=Math.min(n,Math.min(oldMax*n,oldMin*n));
            r=Math.max(r,maxP);
        }
        return r;
        
        
    }
}