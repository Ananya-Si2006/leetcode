class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int p=1;
        int num=n;
        
        while(num>0 )
        {
            int dig=num%10;
            sum+=dig;
            p*=dig;
            num/=10;
            

        }
        int tsum=sum+p;
        if(n%tsum==0)
        return true;
        else
        return false;
        
    }
}