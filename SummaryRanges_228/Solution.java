package SummaryRanges_228;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> results = new ArrayList<>();

        if (nums.length == 0) {
            return results;
        }
        if (nums.length == 1) {
            results.add(String.valueOf(nums[0]));
            return results;
        }

        boolean rangeOpened = false;
        StringBuilder range = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (!rangeOpened && i == nums.length - 1) {
                results.add(String.valueOf(nums[i]));
            } else if (rangeOpened && i == nums.length - 1) {
                range.append("->").append(nums[i]);
                results.add(range.toString());
            } else if (!rangeOpened && nums[i] != nums[i+1] - 1) {
                results.add(String.valueOf(nums[i]));
            } else if (!rangeOpened && nums[i] == nums[i+1] - 1) {
                range.append(nums[i]);
                rangeOpened = true;
            } else if (rangeOpened && nums[i] == nums[i+1] - 1) {
                //extend the range
                continue;
            } else if (rangeOpened && nums[i] != nums[i+1] - 1) {
                rangeOpened = false;
                range.append("->").append(nums[i]);
                results.add(range.toString());
                range.setLength(0);
            }
        }
        return results;
    }
}