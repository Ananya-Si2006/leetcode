class Solution {
    public int numberOfSpecialChars(String word) {
        
        HashSet<Character> upper=new HashSet<>();
        HashSet<Character> lower=new HashSet<>();
        for(char ch: word.toCharArray())
        {
            if(Character.isLowerCase(ch))
            lower.add(ch);
            else
            upper.add(ch);
        }
        int count=0;
        for(char ch:lower)
        {
            if(upper.contains(Character.toUpperCase(ch))&& word.lastIndexOf(ch)<word.indexOf(Character.toUpperCase(ch)))
            count++;
        }
        return count;

    }
}