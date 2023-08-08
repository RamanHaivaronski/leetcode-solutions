package AddDigits_258;

import java.util.HashMap;
import java.util.Map;

class Solution {
    // map with key insertion
    public int addDigits(int num) {
        int sum = 0;

        String test = String.valueOf(num);

        if (test.length() == 1) {
            return num;
        }

//        if (test.length() == 2) {
//            return Integer.parseInt(String.valueOf(test.charAt(0))) + Integer.parseInt(String.valueOf(test.charAt(1)));
//        }

        for (int i = 0; i < test.length(); i++) {
            sum += Integer.parseInt(String.valueOf(test.charAt(i)));
            //sum = sum + (s.charAt(i) - '0');
        }

        return addDigits(sum);
    }

}