package ContainsDuplicateII_219;

import java.util.*;

class Solution {
    // map with key insertion
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, List<Integer>> list = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.containsKey(nums[i]) ) {
                List<Integer> test = list.get(nums[i]);
                for (Integer integer : test) {
                    if (Math.abs(i - integer) <= k) {
                        return true;
                    }
                }
            }
            if (list.get(nums[i]) == null) {
                ArrayList<Integer> input =  new ArrayList<>();
                input.add(i);
                list.put(nums[i], input);
            } else {
                ArrayList<Integer> test3 = (ArrayList<Integer>) list.get(nums[i]);
                test3.add(i);
                list.put(nums[i], test3);

            }
        }
        return false;
    }
}