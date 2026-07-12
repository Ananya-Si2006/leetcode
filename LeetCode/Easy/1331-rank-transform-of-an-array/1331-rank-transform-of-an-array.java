class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int arr2[]=arr.clone();
        Arrays.sort(arr2);

       HashMap<Integer,Integer> map=new HashMap<>();
       int rank=1;
       for(int num:arr2)
       {
        if(!map.containsKey(num))
        {
            map.put(num,rank);
            rank++;
        }
       }
       for(int i=0;i<arr.length;i++)
       {
        arr[i]=map.get(arr[i]);
       }
       return arr;
        
    }
}