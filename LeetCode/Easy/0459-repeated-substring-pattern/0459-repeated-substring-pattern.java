class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled=s+s;
        String n="";
        for(int i=1;i<doubled.length()-1;i++)
        {
             n=n+doubled.charAt(i);
        }
        if(n.contains(s))
        return true;
        else
        return false;
        
    }
}