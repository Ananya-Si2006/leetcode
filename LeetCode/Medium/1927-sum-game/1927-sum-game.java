class Solution {
    public boolean sumGame(String num) {
        
        int n=num.length();
        int half=n/2;
        int rightsum=0;
        int leftsum=0;
        int leftq=0;
        int rightq=0;
        for(int i=0;i<half;i++)
        {
            if(num.charAt(i)=='?')
            leftq++;
            else
            leftsum+=num.charAt(i)-'0';
        }
        for(int i=half;i<n;i++)
        {
            if(num.charAt(i)=='?')
            rightq++;
            else
            rightsum+=num.charAt(i)-'0';
        }
        return 2*(leftsum-rightsum)+9*(leftq-rightq)!=0;
    }
}