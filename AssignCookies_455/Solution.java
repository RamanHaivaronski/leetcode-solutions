package AssignCookies_455;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.IntStream;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        //Arrays.sort(g);
        Arrays.sort(s);
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (s[j] >= g[i]) {
                    count++;
                    if (s.length == 1) {
                        return count;
                    }
                    s = removeTheElement(s, j);
                    break;
                }
            }
        }
        return count;
    }

    public static int[] removeTheElement(int[] arr, int index)
    {
        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }
        // return the resultant array
        return IntStream.range(0, arr.length)
                .filter(i -> i != index)
                .map(i -> arr[i])
                .toArray();
    }

    public void removeElement(int[] arr, int removedIdx) {
        System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.length - 1 - removedIdx);
    }
}