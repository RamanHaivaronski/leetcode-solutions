package FindtheDifference_389;

import java.util.HashMap;

//
class Solution {
    //
    public char findTheDifference1(String s, String t) {
        if (s.length() < 2) {
            return t.charAt(0);
        }

        for (int i = 0; i < s.length(); i++) {
            if (!s.contains(t.substring(i, i+1))) {
                return t.charAt(i);
            }
        }
        return t.charAt(t.length()-1);
    }

    //xor concept
    public char findTheDifference(String s, String t) {
        char result = 0;
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        for (char c : t.toCharArray()) {
            result ^= c;
        }

        return result;
    }
}