package Majority_Element_169;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> test = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (test.containsKey(nums[i])) {
                test.put(nums[i], test.get(nums[i]) + 1);
            } else {
                test.put(nums[i], 1);
            }
        }

        // find max Key based on Values
        return Collections.max(test.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}