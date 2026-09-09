class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int candidate=nums[0];
        int count=1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==candidate)
            count++;
            else
            count--;
            if(count==0)
            {
                candidate=nums[i];
                count=1;
            }
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==candidate)
              c++;
              if(c>n/2)
              return candidate;
        }
        return candidate;
        
    }
}