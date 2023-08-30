package SmallestRangeI_908;
public class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int smallestDiff = 0;

        if (nums.length == 1 || nums.length == 0) {
            return 0;
        }
        //find smallestDiff
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int diff = Math.abs(nums[i] - nums[j]);
                if (diff > smallestDiff) {
                    smallestDiff = diff;
                }
            }
        }

        if (smallestDiff > 2 * k) {
            return smallestDiff - 2 * k;
        } else {
            return 0;
        }
    }
}