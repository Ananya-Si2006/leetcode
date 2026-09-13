class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        int ans[]=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int curr=nums.length-1;
        while(left<=right)
        {
            if(nums[left]>nums[right])
            ans[curr--]=nums[left++];
            else
            ans[curr--]=nums[right--];
        }
        return ans;
        
    }
}