class Solution {
    public int findNumbers(int[] nums) {
        
        int f=0;
        for(int num:nums)
        {
            int c=0;
            while(num>0)
            {
                num/=10;
                c++;
            }
            if(c%2==0)
            f++;
        }
        return f;
    }
}