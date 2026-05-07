class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        if(n<=1)
        return 0;
        int f=0,end=0,jump=0;
        for(int i=0;i<n-1;i++)
        {
            f=Math.max(f,i+nums[i]);
            if(i==end)
            {
                jump++;
                end=f;

                if(end>=n-1)
                break;
            }
        }
        return jump;
        
    }
}