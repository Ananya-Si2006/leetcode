class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int count[]=new int[n+1];
        for(int num:nums)
        {
            count[num]++;
        }
        int i=0;
        for( i=0;i<nums.length;i++)
        {
            if(count[i]==0)
            return i;
        }
        return i;
        
    }
}