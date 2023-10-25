package RepeatedSubstringPattern_459;


public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String sub = doubled.substring(1, doubled.length() - 1);
        return sub.contains(s);
    }
    public boolean repeatedSubstringPattern1(String s) {

        if (s.length() == 1) {
            return false;
        }
        int subLen = 1;
        String sub = s.substring(0,subLen);

        for (int i = 1; i < s.length(); i++) {
            if (s.length() >= i  + subLen) {
                if (!s.substring(i, i + subLen).equals(sub)) {
                    subLen++;
                    sub = s.substring(0, subLen);
                    if (i + subLen >= s.length()) {
                        i = subLen;
                        subLen++;
                        sub = s.substring(0, subLen);
                    }
                } else {
                    i = i + sub.length() - 1;
                    if (i == s.length() - 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}


