package PerfectNumber_507;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }

        List<Integer> divisors = new ArrayList<>();

        for (int i = num/2 + 1; i > 0; i--) {
            if (num % i == 0) {
                divisors.add(i);
            }
        }
        int sum = 0;

        for (int e: divisors) {
            sum += e;
        }
        return sum == num;
    }
}