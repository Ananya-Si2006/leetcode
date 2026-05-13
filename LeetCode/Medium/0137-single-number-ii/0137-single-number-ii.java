class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int res=0;
        for(int i=0;i<n;)
        {
            if(i==n-1||nums[i]!=nums[i+1])
            {
                res=nums[i];
                return res;

            }
            else
            i+=3;
        }
        return res;
        
    }
}