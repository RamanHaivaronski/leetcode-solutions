package CombinationSum_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum1(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (target == 1) {
            return result;
        }

        // add all combinations
        List<List<Integer>> combinations = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            int currentBase = candidates[i];

            for (int j = currentBase; j <= target; j *= 2) {
                // add all elems not sum
                for (int k = j; k >= 0; k -= 2) {
                    List<Integer> currentCombination = new ArrayList<>();
                    currentCombination.add(candidates[i]);
                    combinations.add(new ArrayList<>(currentCombination));
                }


            }
        }

        // sum upp all sums of all combinations and if they are equal to target -> add to the final result array

        return result;
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
        if(remain < 0) return;
        else if(remain == 0) list.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i < nums.length; i++){
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}