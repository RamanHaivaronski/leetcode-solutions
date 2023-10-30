package RelativeRanks_506;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        List<Integer> sorted = new ArrayList<>();
        for (int e: score) {
            sorted.add(e);
        }
        Collections.sort(sorted, Collections.reverseOrder());

        List<String> result = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (score[i] == sorted.get(0)) {
                result.add(i, "Gold Medal");
            } else if (score[i] == sorted.get(1)) {
                result.add(i, "Silver Medal");
            } else if (score[i] == sorted.get(2)) {
                result.add(i, "Bronze Medal");
            } else {
                result.add(i, String.valueOf(sorted.indexOf(score[i]) + 1));
            }
        }
        return result.toArray(new String[0]);
    }
}