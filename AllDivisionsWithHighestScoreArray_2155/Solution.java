package AllDivisionsWithHighestScoreArray_2155;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public List<Integer> maxScoreIndices1(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        int currentDivisor = 0;
        int currentSum = 0;

        int maxSum = 0;
        for (int i = 0; i <= nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j < currentDivisor) {
                    if (nums[j] == 0) {
                        currentSum++;
                    }
                } else {
                    if (nums[j] == 1) {
                        currentSum++;
                    }
                }
            }
            map.put(currentDivisor, currentSum);
            currentDivisor++;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            currentSum = 0;
        }
        for(Map.Entry<Integer, Integer> key: map.entrySet()) {
            if (key.getValue() == maxSum) {
                result.add(key.getKey());
            }
        }
        return result;
    }

    public List<Integer> maxScoreIndices(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int oneCount = 0, zeroCount = 0;

        for(int num : nums)
            if(num == 1) ++oneCount;

        res.add(0);
        int max = oneCount;
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] == 1){
                --oneCount;
            } else if(nums[i] == 0){
                ++zeroCount;
            }
            int total = oneCount + zeroCount;
            if(max < total) {
                res.clear();
                res.add(i+1);
                max = total;
            } else if(max == total){
                res.add(i+1);
            }
        }
        return res;
    }
}