package CombinationSum_40;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<Integer>> result = s.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);

        System.out.println(result);
    }
}