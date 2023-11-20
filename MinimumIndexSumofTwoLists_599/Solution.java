package MinimumIndexSumofTwoLists_599;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

class Solution {
    public String[] findRestaurant1(String[] list1, String[] list2) {
        Map<String, Integer> words = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (Objects.equals(list1[i], list2[j])) {
                    words.put(list1[i], i+j);
                }
            }
        }

        int minSum = list1.length + list2.length - 2;
        for(Map.Entry<String, Integer> entries: words.entrySet()) {
            if (entries.getValue() < minSum) {
                minSum = entries.getValue();
            }
        }

        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Integer> entries: words.entrySet()) {
            if (entries.getValue() == minSum) {
                result.add(entries.getKey());
            }
        }
        return result.toArray(new String[0]);
    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map <String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++)
            map.put(list1[i], i);
        List<String>res = new ArrayList<>();
        int min_sum = Integer.MAX_VALUE, sum;
        for (int j = 0; j < list2.length && j <= min_sum; j++) {
            if (map.containsKey(list2[j])) {
                sum = j + map.get(list2[j]);
                if (sum < min_sum) {
                    res.clear();
                    res.add(list2[j]);
                    min_sum = sum;
                } else if (sum == min_sum)
                    res.add(list2[j]);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}