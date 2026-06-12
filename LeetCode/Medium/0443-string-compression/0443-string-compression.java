class Solution {
    public int compress(char[] chars) {
        
        int i=0;
        int j=0;
        while(i<chars.length)
        {
            char curr=chars[i];
            int count=0;
            while(i<chars.length && chars[i]==curr)
            {
                i++;
                count++;
            }
            chars[j++]=curr;
            if(count>1)
            {
                String c=String.valueOf(count);
                for(char ch: c.toCharArray())
                {
                    chars[j++]=ch;
                }
            }
        }
        return j;
    }
}