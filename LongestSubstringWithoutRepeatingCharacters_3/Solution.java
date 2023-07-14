package LongestSubstringWithoutRepeatingCharacters_3;

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int result = 0;

        HashSet<Character> test = new HashSet<>();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!test.contains(s.charAt(i))) {
                test.add(s.charAt(i));
            } else {
                if (test.size() > result) {
                    result = test.size();
                }
                test.clear();
                i = ++count - 1;
            }
        }

        if (test.size() > result) {
            result = test.size();
        }

        return result;
    }
}