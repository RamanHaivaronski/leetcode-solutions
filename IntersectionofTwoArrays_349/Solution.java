package IntersectionofTwoArrays_349;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int[] intersection1(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (result.contains(nums1[i])) {
                    continue;
                }
                if (nums1[i] == nums2[j]) {
                    result.add(nums1[i]);
                }
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            result.add(nums1[i]);
        }
        Set<Integer> result1 = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            result1.add(nums2[i]);
        }

        result.retainAll(result1);
        return result.stream().mapToInt(i -> i).toArray();
    }
}