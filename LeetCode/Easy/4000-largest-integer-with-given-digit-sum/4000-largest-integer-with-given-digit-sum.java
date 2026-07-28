class Solution {
    public int largestInteger(int n, int s) {
        
        if(s>9*n)
        return -1;

        StringBuilder ans= new StringBuilder();
        for(int i=0;i<n;i++)
        {
            int dig=Math.min(9,s);
            ans.append(dig);
            s-=dig;
        }
        return Integer.parseInt(ans.toString());
    }
}