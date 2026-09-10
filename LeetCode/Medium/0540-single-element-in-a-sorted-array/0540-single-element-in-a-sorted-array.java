class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;)
        {
            if(i==nums.length-1||nums[i]!=nums[i+1])
            {
                res=nums[i];
                return res;
            }
            else
            i+=2;
        }
        return res;
    }
}