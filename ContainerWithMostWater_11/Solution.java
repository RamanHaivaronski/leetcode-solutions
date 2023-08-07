package ContainerWithMostWater_11;

import java.util.*;

class Solution {
    // map with key insertion
    public int maxArea1(int[] height) {
        if (height.length == 2) {
            return Math.min(height[1],height[0]) * Math.min(height[1],height[0]);
        }

        //length, heigth
        HashMap<Integer, Integer> values = new HashMap<>();

        int result = 0;

        int j = height.length - 1;
        for (int i = 0; i < j; i++) {

            values.put(j - i, Math.min(height[j], height[i]));
            if (i + 1 == j) {
                j--;
                i = 0;

                for (Map.Entry<Integer, Integer> entry : values.entrySet()) {
                    Integer key = entry.getKey();
                    Integer value = entry.getValue();
                    if ((key +1) * value > result) {
                        result = (key + 1) * value;
                    }
                }
                values.clear();
            }
        }

        return result;
    }

    //two pointers
    public int maxArea(int[] height) {
        int max_area = 0;
        int a_pointer = 0;
        int b_pointer = height.length - 1;

        while (a_pointer < b_pointer) {
            if (height[a_pointer] < height[b_pointer]) {
                max_area = Math.max(max_area, height[a_pointer] * (b_pointer - a_pointer));
                a_pointer += 1;
            } else {
                max_area = Math.max(max_area, height[b_pointer] * (b_pointer - a_pointer));
                b_pointer -= 1;
            }
        }

        return max_area;
    }

}