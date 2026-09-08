class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer>map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int num:nums1)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int x:nums2)
        {
            if(map.containsKey(x)&& map.get(x)>0)
           { list.add(x);
            map.put(x,map.get(x)-1);
           }
        }
        int out[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            out[i]=list.get(i);
        }
        return out;


        
    }
}