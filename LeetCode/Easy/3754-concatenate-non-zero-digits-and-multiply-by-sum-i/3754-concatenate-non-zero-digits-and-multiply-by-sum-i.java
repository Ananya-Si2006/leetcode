class Solution {
    public long sumAndMultiply(int n) {
        
        StringBuilder sb=new StringBuilder();
        int sum=0;
        for(char ch: String.valueOf(n).toCharArray())
        {
            if(ch!='0')
            {
                sb.append(ch);
                sum+=ch-'0';
            }
        }
        if(sb.length()==0)return 0;
        long x=Long.parseLong(sb.toString());
        return x*sum;
    }
}