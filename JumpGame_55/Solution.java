package JumpGame_55;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public boolean canJump1(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        return searchPoints(Set.of(nums.length - 1), nums, true).size() > 0;
    }

    public static Set<Integer> searchPoints (Set<Integer> initialIndex, int[] nums, boolean contains) {
        Set<Integer> points = new HashSet<>();

        for (Integer index : initialIndex) {
            for (int j = index - 1; j >= 0; j--) {
                if (nums[j] >= index - j) {
                    points.add(j);
                }
                if (points.contains(0)) {
                    return points;
                }
            }
        }
        if (points.contains(0)) {
            return points;
        }
        if (points.size() == 0) {
            contains = false;
            return Set.of();
        }

        searchPoints(points, nums ,true);

        return points;
    }

    public boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}