package Arithmetics.UglyNumber_263;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public boolean isUgly(final int n) {
        if (n == 1) {
            return true;
        }
        int current = n;

        while (true) {
            if (current % 5 == 0) {
                current /= 5;
            } else if (current % 3 == 0) {
                current /= 3;
            } else if (current % 2 == 0) {
                current /= 2;
            }

            if (current == n) {
                return false;
            }
            if (current == 1) {
                return true;
            }
        }
    }

    public boolean isUgly1(final int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0) {
            return false;
        }
        if (n < 7) {
            return true;
        }
        if (n % 5 != 0 && n % 3 != 0 && n % 2 != 0) {
            return false;
        }

        int i = 7;
        while (i < n) {
            for (; i < n; i++) {
                if (!isPrime(i)) {
                    continue;
                }
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) (Math.sqrt(number)))
                .allMatch(n -> number % n != 0);
    }

    // gigachad solution
    public boolean isUgly2(final int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0) {
            return false;
        }
        if (n < 7) {
            return true;
        }

        int current = n;
        while (current % 2 == 0) {
            current /= 2;
        }
        while (current % 3 == 0) {
            current /= 3;
        }
        while (current % 5 == 0) {
            current /= 5;
        }
        return current == 1;
    }
}