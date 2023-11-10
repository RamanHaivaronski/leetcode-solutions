package Subsets_78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Combinations, Permutations
class Solution {
    //Algotithm 1: Cascading
    public List<List<Integer>> subsets4(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<>());

        // проход по все числам
        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList<>();
            //в сабсеты добавляем все варианты (текущие ответы + новое число)
            for (List<Integer> curr : output) {
                newSubsets.add(new ArrayList<>(curr){{add(num);}});
            }
            // добавляем в ответы все новые сабсеты
            for (List<Integer> curr : newSubsets) {
                output.add(curr);
            }
        }
        return output;
    }

    //Algorithm 2: Backtracking
    List<List<Integer>> output = new ArrayList<>();
    int n, k;

    public void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
        // if the combination is done
        if (curr.size() == k) {
            output.add(new ArrayList<>(curr));
            return;
        }
        for (int i = first; i < n; ++i) {
            // add i into the current combination
            curr.add(nums[i]);
            // use next integers to complete the combination
            backtrack(i + 1, curr, nums);
            // backtrack
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> subsets1(int[] nums) {
        n = nums.length;
        for (k = 0; k < n; k++) {
            backtrack(0, new ArrayList<>(), nums);
        }
        return output;
    }

    //Approach 3: Lexicographic (Binary Sorted) Subsets KNUTH
    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        int n = nums.length;

        for (int i = (int)Math.pow(2, n); i < (int)Math.pow(2, n + 1); ++i) {
            // generate bitmask, from 0..00 to 1..11
            String bitmask = Integer.toBinaryString(i).substring(1);

            // append subset corresponding to that bitmask
            List<Integer> curr = new ArrayList<>();
            for (int j = 0; j < n; ++j) {
                if (bitmask.charAt(j) == '1') curr.add(nums[j]);
            }
            output.add(curr);
        }
        return output;
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int i: nums) {
            List<List<Integer>> subsets = new ArrayList<>();
            // add to subsets cur number + a new number
            for (List<Integer> k: result) {
                subsets.add(new ArrayList<>(k){{add(i);}});
            }
            result.addAll(subsets);
        }
        return result;
    }

}