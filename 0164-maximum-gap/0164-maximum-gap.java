class Solution {
    public int maximumGap(int[] nums) {
        int max=0;
        int d=0;
        if(nums.length<2)
        return 0;
        else
        {
            Arrays.sort(nums);
            for(int i=0;i<nums.length-1;i++)
            {
                d=nums[i+1]-nums[i];
                if(d>max)
                max=d;
            }

        }
        return max;
        
    }
}