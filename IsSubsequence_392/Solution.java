package IsSubsequence_392;

public class Solution {
    public boolean isSubsequence(String s, String t) {

        if (s.length() == 0) {
            return true;
        }
        if (t.length() == 0) {
            return false;
        }
        int counter = 0;

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(counter) == t.charAt(i)) {
                counter++;
            }
            if (counter == s.length()) {
                return true;
            }
        }

        return false;
    }
}