class Solution {
    public int[] findErrorNums(int[] nums) {
        int count[]=new int[nums.length+1];
        int d=-1;
        int m=-1;
        for(int num:nums)
        {
            count[num]++;

        }
        for(int i=1;i<=nums.length;i++)
        {
            if(count[i]==2)
            d=i;
            if(count[i]==0)
            m=i;
        }
        return new int[]{d,m};
        
    }
}