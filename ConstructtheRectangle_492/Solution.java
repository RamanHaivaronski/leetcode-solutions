package ConstructtheRectangle_492;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] constructRectangle(int area) {
        int currLen = area;
        int currWid = 1;

        for (int i = currWid; i < currLen; i++) {
            if (currLen >= currWid && area % i == 0) {
                currLen = area / i;
                currWid = i;
            }
        }

        return new int[]{currLen, currWid};
    }
}