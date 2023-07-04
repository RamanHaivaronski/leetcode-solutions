package ContainsDuplicate_217;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    // map with key insertion
    public boolean containsDuplicateMap(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }
    //sgn hashset
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                return true;
            } else {
                list.add(nums[i]);
            }
        }
        return false;
    }
    // Arrays.sort
    // for loop and check if elem == elem+1


    // double for loop
    public boolean containsDuplicate1(int[] nums) {
        int cur_val;
        int occ = 0;
        for (int i = 0; i < nums.length; i++) {
            cur_val = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == cur_val) {
                    occ++;
                }
            }
            if (occ > 1) {
                return true;
            }
            occ = 0;
        }
        return false;
    }

}