package SetMatrixZeroes_73;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> usedIs = new ArrayList<>();
        List<Integer> usedJs = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (!usedIs.contains(i)) {
                        usedIs.add(i);
                    }
                    if (!usedJs.contains(j)) {
                        usedJs.add(j);
                    }

                }
            }
        }

        for (int i = 0; i < usedIs.size(); i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[usedIs.get(i)][j] != 0) {
                    matrix[usedIs.get(i)][j] = 0;
                }

            }
        }

        for (int j = 0; j < usedJs.size(); j++) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][usedJs.get(j)] != 0) {
                    matrix[i][usedJs.get(j)] = 0;
                }
            }
        }
    }
}