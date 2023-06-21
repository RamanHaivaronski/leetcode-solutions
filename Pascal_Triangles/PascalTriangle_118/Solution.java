package Pascal_Triangles.PascalTriangle_118;

import java.util.ArrayList;
import java.util.List;

//Complexity O(n2)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0) {
            return result;
        }

        List<Integer> first_row  = new ArrayList<>();
        first_row.add(1);
        result.add(first_row);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = result.get(i - 1);
            List<Integer> row = new ArrayList<>();
            //most left
            row.add(1);
            //middle
            for (int j = 1; j < i; j++) {
                row.add(prev_row.get(j - 1) + prev_row.get(j));
            }
            // most right
            row.add(1);
            result.add(row);
        }
        return result;
    }
}