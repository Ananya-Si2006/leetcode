class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum[]=new int[nums.length];
        int rightSum[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=0;j<i;j++)
            {
                sum+=nums[j];

            
            }
            leftSum[i]=sum;
        }
        for(int i=0;i<nums.length;i++)
        {
            int sum1=0;
            for(int j=i+1;j<nums.length;j++)
            {
                sum1+=nums[j];
            }
            rightSum[i]=sum1;
        }
        int ans[]=new int [nums.length];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return ans;
        
    }
}