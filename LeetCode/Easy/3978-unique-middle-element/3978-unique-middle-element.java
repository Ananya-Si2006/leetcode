class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int length= nums.length;

        if (length==1)
        return true;
       int mid=nums[length/2];
       Arrays.sort(nums);
       int count=0;
       for(int num:nums)
       {
        if(num!=mid)
        continue;
        else
        count++;
       }
       if(count>1)
       return false;
       else 
       return true;
    }
}