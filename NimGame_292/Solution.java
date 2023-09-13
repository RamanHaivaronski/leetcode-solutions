package NimGame_292;

import java.util.Arrays;

class Solution {
    public boolean canWinNim(int n) {
        if (n < 4) {
            return true;
        }
        if (n % 4 == 0) {
            return false;
        }
        if (((n-1) % 4) == 0 ||
            ((n-2) % 4) == 0 ||
            ((n-3) % 4) == 0) {
                return true;
        } else {
            return false;
        }
    }
}