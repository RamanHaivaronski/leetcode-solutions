package Combinations_77;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = i + 1;
        }
        backtrack(ans, new ArrayList<>(), lst, k, 0);
        return ans;
    }
    private void backtrack(List<List<Integer>> ans, List<Integer> temp, int[] lst, int k, int idx) {
        if (temp.size() == k) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = idx; i < lst.length; i++) {
            temp.add(lst[i]);
            backtrack(ans, temp, lst, k, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}