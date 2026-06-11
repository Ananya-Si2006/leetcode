class Solution {
     int index=0;
    public String decodeString(String s) {
       return helper(s);
        
    }
    private String helper(String s)
    {
         StringBuilder res=new StringBuilder();
        int num=0;
        
        while(index<s.length())
        {
            char c=s.charAt(index);
            if(Character.isDigit(c))
            num=num*10+(c-'0');
            else if(c=='[')
            {
                index++;
                String decoded= helper(s);
                while(num-->0)
                res.append(decoded);
                num=0;
            }
            else if(c==']')
            {
                return res.toString();
            }
            else
            res.append(c);
            index++;
        }
        return res.toString();
    }
}