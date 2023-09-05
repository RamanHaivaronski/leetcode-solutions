package ArrangingCoins_441;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    //beyond the time limit
    public int arrangeCoins1(int n) {
        int result = 0;
        int counter = 0;

        for (int i = n; i > 0;){
            counter++;
            if (i - counter >= 0) {
                result++;
                i -= counter;
            } else if (i < result) {
                result++;
                break;
            }
        }
        return result;
    }

    public int arrangeCoins3(int n) {
        int res = 0;
        for(res = 1; res <= n; res++) {
            n = n - res;
        }
        return res - 1;
    }

    // pow(x, 2) + x - 2 * sum = 0
    // pow(x, 2) + x = 2 * sum;
    // D = --1 - 4 * 1 * (-2 * sum);
    //result = (-1 +- root(D)) / 2
    public int arrangeCoins(int n) {
        int result = 0;

        int Disc = 1 - 4 * (-2 * n);
        result = (int) Math.abs((-1 + Math.sqrt(Disc)) / 2);
        return result;
    }

}