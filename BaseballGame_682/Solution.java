package BaseballGame_682;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;

        List<Integer> results = new ArrayList<>();
        //nt prevScore = 0;
        for (int i = 0; i < operations.length; i++) {
            if (Objects.equals(operations[i], "+")) {
                sum += results.get(results.size() - 1) + results.get(results.size() - 2);
                results.add(results.get(results.size() - 1) + results.get(results.size() - 2));
            } else if (Objects.equals(operations[i], "D")) {
                sum += results.get(results.size() - 1) * 2;
                results.add(results.get(results.size() - 1) * 2);
            } else if (Objects.equals(operations[i], "C")) {
                sum -= results.get(results.size() - 1);
                results.remove(results.size() - 1);
            } else {
                sum += Integer.parseInt(operations[i]);
                results.add(Integer.parseInt(operations[i]));
            }
        }

        return sum;
    }
}