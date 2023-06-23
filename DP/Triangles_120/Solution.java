package DP.Triangles_120;

import java.util.Collections;
import java.util.List;

//Complexity O(n2)
class Solution {
    // No DP - select from all rows
    public int minimumTotal(List<List<Integer>> triangle) {

        int result = triangle.get(0).get(0);

        if (triangle.size() == 1) {
            return result;
        }

        for (int i = 1; i < triangle.size(); i++) {
            int min = Collections.min(triangle.get(i));
            result += min;
        }
        return result;
    }

    public int minimumTotalDP(List<List<Integer>> triangle) {

        int heigth = triangle.size();
        int [][] dp = new int[heigth + 1][heigth + 1];

        for (int level = heigth - 1; level >= 0; level--) {

            for (int i = 0; i <= level; i++) {

                dp[level][i] = triangle.get(level).get(i)
                        + Math.min(dp[level + 1][i], dp[level + 1][i + 1]);

            }
        }

        return dp[0][0];
    }
}