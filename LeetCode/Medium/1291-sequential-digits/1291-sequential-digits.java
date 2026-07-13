class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res=new ArrayList<>();
       String dig="123456789";
       int lowLen=String.valueOf(low).length();
       int highLen=String.valueOf(high).length();
       for(int i=lowLen;i<=highLen;i++)
       {
        for(int j=0;j+i<=9;j++)
        {
            int num=Integer.parseInt(dig.substring(j,j+i));
            if(num>=low && num<=high)
            res.add(num);
        }
       }
       return res;
        
    }
}