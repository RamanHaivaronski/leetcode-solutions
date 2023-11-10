package DegreeofanArray_697;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int elem: nums) {
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        }

        List<Integer> maxFreqs = new ArrayList<>();
        int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the HashMap
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {  // Iterate through HashMap
            if (entry.getValue() == maxValueInMap) {
                maxFreqs.add(entry.getKey());     // Print the key with max value
            }
        }

        List<Integer> results = new ArrayList<>();

        for (Integer maxFreq : maxFreqs) {
            int firstIndex = 0;
            int lastIndex = nums.length - 1;
            for (int i = 0; i < nums.length; i++) {
                if (maxFreq == nums[i]) {
                    firstIndex = i;
                    break;
                }
            }
            for (int k = nums.length - 1; k > 0; k--) {
                if (maxFreq == nums[k]) {
                    lastIndex = k;
                    break;
                }
            }
            results.add(lastIndex - firstIndex + 1);
        }

        return Collections.min(results);
    }
}