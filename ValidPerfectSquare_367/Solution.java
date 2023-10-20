package ValidPerfectSquare_367;

import java.math.BigInteger;

public class Solution {
    public boolean isPerfectSquare1(int num) {

        double srqt = Math.sqrt(num);

        if ((srqt == Math.floor(srqt)) && !Double.isInfinite(srqt)) {
            return true;
        }

        return false;
    }

    public boolean isPerfectSquare2(int num) {

        for (int i = 1; i <= num; i++) {
            if (i * i == num) {
                return true;
            }
        }

        return false;
    }

    public boolean isPerfectSquare(int num) {

        //start with upper bound
        // divide by two but take upper boundary everytime
        long r = num;
        while (r * r > num) {
            r = (r + num/r) / 2;
        }

        return r * r == num;
    }
}