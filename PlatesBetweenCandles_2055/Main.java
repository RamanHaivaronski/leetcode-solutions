package PlatesBetweenCandles_2055;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.platesBetweenCandles("***|**|*****|**||**|*", new int[][] {{1,17}, {4,5}, {14,17}, {5,11}, {15,16}});

        System.out.println(result);
    }
}