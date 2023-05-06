package TwoSum1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    //My solution brute force
    //In two loops check if sum of elems = target
    // Time Complexity 0(n2) - two loops
    // Space complexity O(1)
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    //Good solution using HashMap
    //Put values in HashMap - if complement exists in map return current index and complement
    // Time Complexity 0(n) - 1 loop
    // Space complexity O(n)
    public int[] twoSumOptimal(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}