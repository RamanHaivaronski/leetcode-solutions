package Sum_15;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<Integer>> result = s.threeSum(new int[] {-1,0,1,2,-1,-4});

        System.out.println(result);
    }
}