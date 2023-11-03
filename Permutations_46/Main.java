package Permutations_46;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<Integer>> result = s.permute(new int[] {1,2,3});

        System.out.println(result);
    }
}