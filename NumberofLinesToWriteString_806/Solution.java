package NumberofLinesToWriteString_806;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        Character[] letters = new Character[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Map<Character, Integer> letterMap = new HashMap<>();
        for (int i = 0; i < letters.length; i++) {
            letterMap.put(letters[i], widths[i]);
        }

        int countLines = 0;
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (sum + letterMap.get(s.charAt(i)) <= 100) {
                sum += letterMap.get(s.charAt(i));
            } else {
                sum = letterMap.get(s.charAt(i));
                countLines++;
            }
        }

        if (sum != 0) {
            countLines++;
        }


        return new int[] {countLines, sum};
    }
}