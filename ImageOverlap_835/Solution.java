package ImageOverlap_835;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int largestOverlap1(int[][] img1, int[][] img2) {
        int result = 0;

        for (int k = 0; k < img1.length; k++) {

        }

        return result;
    }

    public int compareArrays(int[][] img1, int[][] img2) {
        int result = 0;

        for (int i = 0; i < img1.length; i++) {
            for (int j = 0; j < img1.length; j++) {
                int currElemFromFirst = img1[i][j];
                int currElemFromSecond = img2[i][j];
                if (currElemFromSecond == currElemFromFirst && currElemFromSecond == 1) {
                    result++;
                }
            }

        }
        return result;
    }

    /**
     *  Shift the matrix M in up-left and up-right directions
     *    and count the ones in the overlapping zone.
     */
    protected int shiftAndCount(int xShift, int yShift, int[][] M, int[][] R) {
        int leftShiftCount = 0, rightShiftCount = 0;
        int rRow = 0;
        // count the cells of ones in the overlapping zone.
        for (int mRow = yShift; mRow < M.length; ++mRow) {
            int rCol = 0;
            for (int mCol = xShift; mCol < M.length; ++mCol) {
                if (M[mRow][mCol] == 1 && M[mRow][mCol] == R[rRow][rCol])
                    leftShiftCount += 1;
                if (M[mRow][rCol] == 1 && M[mRow][rCol] == R[rRow][mCol])
                    rightShiftCount += 1;
                rCol += 1;
            }
            rRow += 1;
        }
        return Math.max(leftShiftCount, rightShiftCount);
    }

    public int largestOverlap(int[][] A, int[][] B) {
        int maxOverlaps = 0;

        for (int yShift = 0; yShift < A.length; ++yShift)
            for (int xShift = 0; xShift < A.length; ++xShift) {
                // move the matrix A to the up-right and up-left directions.
                maxOverlaps = Math.max(maxOverlaps, shiftAndCount(xShift, yShift, A, B));
                // move the matrix B to the up-right and up-left directions, which is equivalent to moving A to the down-right and down-left directions
                maxOverlaps = Math.max(maxOverlaps, shiftAndCount(xShift, yShift, B, A));
            }

        return maxOverlaps;
    }
}