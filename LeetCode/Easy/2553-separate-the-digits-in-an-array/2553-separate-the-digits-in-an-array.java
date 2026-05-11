class Solution {
    public int[] separateDigits(int[] nums) {
        int n=nums.length;
        String s="";
        for(int i=0;i<n;i++)
        {
            s+=Integer.toString(nums[i]);

        }
        int l=s.length();
        int ans[]=new int[l];
        
        for(int i=0;i<l;i++)

        {
            char ch=s.charAt(i);
            ans[i]=ch-'0';
            
        }
        return ans;
        
    }
}