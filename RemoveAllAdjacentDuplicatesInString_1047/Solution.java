package RemoveAllAdjacentDuplicatesInString_1047;


import java.util.HashMap;

public class Solution {
    public String removeDuplicates1(String s) {
        if (s.length() < 2) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.deleteCharAt(i).deleteCharAt(i);
                i = -1;
            }
        }

        return sb.toString();
    }

    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        for (char ch: S.toCharArray()) {
            if (sb.length() != 0 && sb.charAt(sb.length() - 1) == ch) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}