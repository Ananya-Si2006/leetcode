class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if(p.length()>s.length())
        return ans;
        int P[]=new int[26];
        int S[]=new int[26];
        for(int i=0;i<p.length();i++)
        {
            P[p.charAt(i)-'a']++;
            S[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(P,S))
        ans.add(0);
        for(int i=p.length();i<s.length();i++)
        {
            S[s.charAt(i)-'a']++;
            S[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(S,P))
            ans.add(i-p.length()+1);
        }
        return ans;
    }
}