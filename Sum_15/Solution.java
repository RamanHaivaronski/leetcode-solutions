package Sum_15;

import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public List<List<Integer>> threeSum1(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> pairs = twoSumOptimal(Arrays.copyOfRange(nums, i+1, nums.length), -nums[i]);

            if (pairs.size() > 0) {
                for (int j = 0; j < pairs.size(); j++) {
                    List<Integer> interimArr = new ArrayList<>();
                    interimArr.add(nums[i]);
                    interimArr.addAll(pairs.get(j));

                    Collections.sort(interimArr);
                    if (!result.contains(interimArr)) {
                        result.add(interimArr);
                    }

                }

            }
        }
        return result;
    }

    public List<List<Integer>> twoSumOptimal(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    result.add(List.of(nums[i], nums[j]));
                }
            }
        }
        return result;
    }

    //turn it into 2-sum
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    // Found a triplet with zero sum
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // Skip duplicate elements for j
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }

                    // Skip duplicate elements for k
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }

                    // Move the pointers
                    j++;
                    k--;
                } else if (sum < 0) {
                    // Sum is less than zero, increment j to increase the sum
                    j++;
                } else {
                    // Sum is greater than zero, decrement k to decrease the sum
                    k--;
                }
            }
        }
        return ans;
    }
}