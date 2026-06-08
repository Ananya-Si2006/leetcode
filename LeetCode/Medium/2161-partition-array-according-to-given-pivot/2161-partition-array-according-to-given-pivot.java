class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int lessCount=0;
        int equalCount=0;
        for(int num:nums)
        {
            if(num<pivot)
            lessCount++;
            else if(num==pivot)
            equalCount++;

        }
        int less=0;
        int equal=lessCount;
        int more=lessCount+equalCount;
        int result[]=new int[nums.length];
        for(int num:nums)
        {
            if(num<pivot)
            result[less++]=num;
            else if(num==pivot)
            result[equal++]=num;
            else if(num>pivot)
            {
                result[more++]=num;
            }
        }
        return result;
    }
}