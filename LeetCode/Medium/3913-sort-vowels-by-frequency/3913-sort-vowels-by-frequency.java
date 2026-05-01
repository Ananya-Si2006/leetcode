

    class Solution {
    public String sortVowels(String s) {
        int[] freq = new int[26];
        int[] first = new int[26];
        Arrays.fill(first, -1);

        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (isVowel(ch)) {
                freq[ch - 'a']++;
                if (first[ch - 'a'] == -1) {
                    first[ch - 'a'] = i;
                }
            }
        }

        
        List<Character> vowels = new ArrayList<>();
        for (char ch : new char[]{'a', 'e', 'i', 'o', 'u'}) {
            if (freq[ch - 'a'] > 0) {
                vowels.add(ch);
            }
        }

        
        vowels.sort((a, b) -> {
            if (freq[b - 'a'] != freq[a - 'a']) {
                return freq[b - 'a'] - freq[a - 'a'];
            }
            return first[a - 'a'] - first[b - 'a'];
        });

    
        StringBuilder sortedVowels = new StringBuilder();
        for (char ch : vowels) {
            for (int i = 0; i < freq[ch - 'a']; i++) {
                sortedVowels.append(ch);
            }
        }

        
        char[] arr = s.toCharArray();
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isVowel(arr[i])) {
                arr[i] = sortedVowels.charAt(idx++);
            }
        }

        return new String(arr);
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
    
   