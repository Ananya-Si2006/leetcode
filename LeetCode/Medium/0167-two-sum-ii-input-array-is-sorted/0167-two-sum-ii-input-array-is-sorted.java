class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int s=0;
        int i=0;
        int j=n-1;
        while(i<j)
        {
           s=numbers[i]+numbers[j];
           if(s==target)
           return new int[] {i+1,j+1};
           else if(s<target)
           i++;
           else 
           j--;
        }
        return new int[] {};
        
    }
}