package FindAllNumbersDisappearedinanArray_448;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> findDisappearedNumbers1(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            result.add(nums[i]);
        }

        for (int i = 1; i <= n; i++) {
            if (result.contains(i)) {
                result.removeAll(Collections.singleton(i));
            } else {
                result.add(i);
            }
        }

        return result;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int val : nums) {
            set.add(val);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}