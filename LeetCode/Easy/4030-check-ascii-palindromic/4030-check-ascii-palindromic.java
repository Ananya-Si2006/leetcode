class Solution {
    public boolean isPalindromic(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<=right)
        {
            int a=s.charAt(left);
            int b=s.charAt(right);
            int rev=0;
            for(int i=0;i<8;i++)
            {
                rev=(rev<<1) | (b&1);
                b>>=1;

            }
            if(a!=rev)
            return false;

            left++;
            right--;
        }
        return true;
    }
}