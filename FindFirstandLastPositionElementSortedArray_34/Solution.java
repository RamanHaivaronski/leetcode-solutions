package FindFirstandLastPositionElementSortedArray_34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1,-1};

        boolean firstFound = false;

        for (int i = 0; i < nums.length; i++) {
            if (firstFound && nums[i] == target) {
                result[1] = i;
            } else if (nums[i] == target) {
                result[0] = i;
                result[1] = i;
                firstFound = true;
            }
        }

        return result;
    }
}