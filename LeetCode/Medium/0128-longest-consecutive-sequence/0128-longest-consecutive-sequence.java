class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int c=0;
        if(n==0)
        return 0;
        int longest=0;
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            st.add(nums[i]);
        }
        for(int i:st)
        {
            if(!st.contains(i-1))
            {
                c=1;
                int x=i;
                while(st.contains(x+1))
                
                {
                    c+=1;
                    x+=1;
                }
            }
            longest=Math.max(longest,c);
        }
        return longest;
       
        
    }
}