class Solution {
    public int myAtoi(String s) {
        
        s=s.trim();
        int i=0;
        int n=s.length();
        int sign=1;
        if(i<n && s.charAt(i)=='-')
        {
            sign=-1;
            i++;
        }
        else if(i<n && s.charAt(i)=='+')
        i++;
        long num=0;
        while(i<n && Character.isDigit(s.charAt(i)))
        {
            int dig=s.charAt(i)-'0';
            num=num*10+dig;
            if(sign==1 && num>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
            if(sign==-1 && -num<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
            i++;
        }
        return (int)(sign*num);


        
    
    }
}