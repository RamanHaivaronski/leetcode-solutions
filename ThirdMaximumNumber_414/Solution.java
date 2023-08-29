package ThirdMaximumNumber_414;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public int thirdMax(int[] nums) {
        //List<Integer> result = new ArrayList<>();
        int[] result = IntStream.of(nums).sorted().distinct().toArray();

        if (result.length < 3) {
            return Arrays.stream(result).max().orElse(result[result.length - 1]);
        } else {
            return result[result.length - 3];
        }
    }
}