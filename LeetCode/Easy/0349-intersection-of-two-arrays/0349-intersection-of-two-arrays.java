class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> res=new HashSet<>();
        for(int num:nums1)
        {
            set.add(num);
        }
        for(int n:nums2)
        {
            if(set.contains(n))
            res.add(n);
        }
        int out[]=new int[res.size()];
        int i=0;
        for(int x:res)
        {
            out[i]=x;
            i++;
        }
       return out;
    }
}