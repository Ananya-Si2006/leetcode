class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,Integer> first=new HashMap<>();
        HashMap<Integer,Integer>last=new HashMap<>();
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int x=nums[i];
            freq.put(x,freq.getOrDefault(x,0)+1);
            if(!first.containsKey(x))
            first.put(x,i);

            last.put(x,i);
        }
        int ans=0;
        for(int x:freq.keySet())
        {
            int count=freq.get(x);
            int length=last.get(x)-first.get(x)+1;
            if(count==length)
            ans++;

        }
        return ans;
        
    }
}