class Solution {
    public int smallestNumber(int n, int t) {
        while(true)
        {
            if(digP(n)%t==0)
            return n;
            else n++;
        }

        
    }
    private int  digP(int num)
    {
        int p=1;
        while(num>0)
        {
            p*=num%10;
            num=num/10;
        }
        return p;
    }
}