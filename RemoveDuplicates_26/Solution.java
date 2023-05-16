package RemoveDuplicates_26;


import java.util.HashMap;

public class Solution {

    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> expectedNums  = new HashMap<>();

        for (int num : nums) {
            if (expectedNums .containsKey(num)) {
            } else {
                expectedNums .put(num, 0);
            }
        }
        return expectedNums .size();
    }

    public int removeDuplicates1(int[] nums) {
        int i = 1;
        for (int n : nums) {
            if (n > nums[i-1]) {
                nums[i++] = n;
            }
        }

        return i;
    }

}