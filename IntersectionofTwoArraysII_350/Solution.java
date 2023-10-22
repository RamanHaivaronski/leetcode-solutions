package IntersectionofTwoArraysII_350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
//    public int[] intersect1(int[] nums1, int[] nums2) {
//        Map<Integer, Integer> result = new HashMap<>();
//        for (int i = 0; i < nums1.length; i++) {
//            result.put(nums1[i], result.getOrDefault(nums1[i], 1) + 1);
//        }
//        Map<Integer, Integer> result1 = new HashMap<>();
//        for (int i = 0; i < nums2.length; i++) {
//            result1.put(nums1[i], result.getOrDefault(nums2[i], 1) + 1);
//        }
//
//        List<Integer> finalOutput = new ArrayList<>();
//
//        if ((long) result.values().size() > (long) result1.values().size()) {
//            result.keySet().stream().filter(elem -> {
//                if (!result1.containsKey(elem)) {
//                    result.remove(elem);
//                } else {
//                    result.put(elem, result.getOrDefault(result.get(elem), 0) - 1);
//                }
//                return true;
//            }).collect(Collectors.toSet());
//            result.forEach(elem -> {
//                if (result.get(elem).intValue() > 0) {
//                    finalOutput.add(elem);
//                }
//            });
//        } else {
//            //result1.retainAll(result);
//
//        }
//
//
//        return finalOutput.stream().mapToInt(i -> i).toArray();
//    }

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums1){
            int freq = map.getOrDefault(i, 0);
            map.put(i, freq + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums2){
            if(map.get(i) != null && map.get(i) > 0){
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int[] ret = new int[list.size()];
        for(int i = 0; i < list.size();i++){
            ret[i] = list.get(i);
        }
        return ret;
    }
}