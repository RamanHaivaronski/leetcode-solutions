package IntersectionofTwoArraysII_350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int j : nums1) {
            map1.put(j, map1.getOrDefault(j, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int currValue : nums2) {
            if (map1.get(currValue) != null && map1.get(currValue) > 0) {
                list.add(currValue);
                map1.put(currValue, map1.get(currValue) - 1);
            }
        }

        return  list.stream().mapToInt(x -> x).toArray();
    }
}