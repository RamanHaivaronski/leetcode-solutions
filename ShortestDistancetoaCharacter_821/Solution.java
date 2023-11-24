package ShortestDistancetoaCharacter_821;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] shortestToChar(String s, char c) {

        List<Integer> cIndexes = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                cIndexes.add(i);
            }
        }

        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int minDistance = s.length();
            for (int j = 0; j < cIndexes.size(); j++) {
                if (Math.abs(cIndexes.get(j) - i) < minDistance) {
                    minDistance = Math.abs(cIndexes.get(j) - i);
                }
            }
            result[i] = minDistance;
        }

        return result;
    }
}