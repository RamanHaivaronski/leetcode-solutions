package GuessNumberHigherorLower_374;


import java.util.ArrayList;
import java.util.List;

/**
 * Forward declaration of guess API.
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution {
    public int guessNumber(int n) {
        int firstPointer = 0;
        int lastPointer = n;

        if (n == 1) {
            return 1;
        }
        for (; firstPointer < lastPointer;) {
            int mid = (lastPointer - firstPointer) / 2;
            if (mid == 0) {
                return lastPointer;
            }
            int guessNumber = firstPointer + mid;
            if (this.guess(guessNumber) == 0) {
                return guessNumber;
            } else if (this.guess(guessNumber) == -1) {
                lastPointer = guessNumber;
            } else {
                firstPointer = guessNumber;
            }
        }
        return firstPointer;
    }

//    -1: Your guess is higher than the number I picked (i.e. num > pick).
//            1: Your guess is lower than the number I picked (i.e. num < pick).
//            0: your guess is equal to the number I picked (i.e. num == pick).
    public int guess(int num) {
        int pick = 2;
        return Integer.compare(pick, num);
    }
}