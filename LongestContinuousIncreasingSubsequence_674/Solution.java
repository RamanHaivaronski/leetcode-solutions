package LongestContinuousIncreasingSubsequence_674;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        List<Integer> results = new ArrayList<>();
        int result = 1;

        if (nums.length == 1) {
            return 1;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                result++;
                if (i == nums.length - 2) {
                    results.add(result);
                }
            } else {
                results.add(result);
                result = 1;
            }

        }
        return Collections.max(results);
    }
}