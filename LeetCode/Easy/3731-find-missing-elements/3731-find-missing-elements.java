class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        int k=1;
        for(int i=nums[0];i<nums[nums.length-1];i++)
        {
            if(nums[0+k]==i+1)
            {k++;
            continue;
            }
            else
            list.add(i+1);

        }
        return list;

        
    }
}