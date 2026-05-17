class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
       boolean res=false;
       for(int i=1;i<s.length();i++)
       {
        int a=s.charAt(i)-'0';
        int b=s.charAt(i-1)-'0';
        int d=Math.abs(a-b);
        if(d<=2)
        res=true;
        else
        {
            res=false;
            break;
        }
       }
       return res;
        
    }
}