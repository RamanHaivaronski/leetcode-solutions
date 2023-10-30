package IslandPerimeter_463;

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int result = 0;

        if (grid.length == 1 && grid[0].length == 1) {
            return 4;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    if (j == 0 || grid[i][j - 1] == 0) {
                        result++;
                    }
                    if (j == grid[0].length - 1 || grid[i][j + 1] == 0) {
                        result++;
                    }
                    if (i == 0 || grid[i - 1][j] == 0) {
                        result++;
                    }
                    if (i == grid.length - 1 || grid[i + 1][j] == 0) {
                        result++;
                    }
                }
            }
        }


        return result;
    }
}