package IsomorphicStrings_205;

import java.util.*;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int indexS = mapS.getOrDefault(s.charAt(i), -1);
            int indexT = mapT.getOrDefault(t.charAt(i), -1);

            if (indexS != indexT) {
                return false;
            }

            mapS.put(s.charAt(i), i);
            mapT.put(t.charAt(i), i);
        }

        // Arrays.binarySearch(new int[] {1, 2, 3}, 2);

        return true;
    }
}