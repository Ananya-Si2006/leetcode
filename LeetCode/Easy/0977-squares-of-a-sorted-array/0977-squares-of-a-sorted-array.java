class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int pointer=n-1;
        int ans[]=new int[n];
        while(left<=right)
        {
            int L=nums[left]*nums[left];
            int R=nums[right]*nums[right];
            if(L>R)
            {
                ans[pointer]=L;
                left++;

            }
            else
            {
                ans[pointer]=R;
                right--;
            }
            pointer--;
        }
        return ans;
        
    }
}