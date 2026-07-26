class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int p1=1;
        int p2=1;
        p1= nums[n-1]*nums[n-2]*nums[n-3];
        p2= nums[0]*nums[1]*nums[n-1];
        int res= Math.max(p1,p2);
        return res;
      
        
    }
}