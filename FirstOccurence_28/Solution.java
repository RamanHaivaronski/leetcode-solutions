package FirstOccurence_28;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() < 1 || needle.length() > haystack.length()) {
            return -1;
        }
        if (haystack.equals(needle)) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0) && haystack.startsWith(needle, i)) {
                return i;
            }
        }

        return -1;
    }


}