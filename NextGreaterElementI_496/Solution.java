package NextGreaterElementI_496;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if (nums1.length == 1) {
            return new int[]{-1};
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int elem = nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                if (elem == nums2[j]) {
                    for (int k = j; k < nums2.length; k++) {
                        if (k == nums2.length - 1 && nums2[k] <= elem) {
                            list.add(-1);
                            break;
                        }
                        if (nums2[k] > elem) {
                            list.add(nums2[k]);
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}