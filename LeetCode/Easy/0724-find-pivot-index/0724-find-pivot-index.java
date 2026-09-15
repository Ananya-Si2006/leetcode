class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int tsum=0;
        for(int i=0;i<n;i++)
        {
            tsum+=nums[i];
        }
        int l=0;
        for(int i=0;i<n;i++)
        {
            if(l==tsum-l-nums[i])
            return i;
            l+=nums[i];
        }
        return -1;


        
    }
}