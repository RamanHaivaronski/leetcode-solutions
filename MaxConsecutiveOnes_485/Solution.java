package MaxConsecutiveOnes_485;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;

        int tempCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                tempCount++;
                if (tempCount > result) {
                    result = tempCount;
                }
            } else {
                tempCount = 0;
            }
        }

        return result;
    }
}