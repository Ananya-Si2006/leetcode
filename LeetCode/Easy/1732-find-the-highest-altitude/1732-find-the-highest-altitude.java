class Solution {
    public int largestAltitude(int[] gain) {
        int curr=0;
        int maxAlt=0;
        for(int alt:gain)
        {
            curr+=alt;
            maxAlt=Math.max(maxAlt,curr);
        }
        return maxAlt;
    }
}