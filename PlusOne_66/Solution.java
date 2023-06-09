package PlusOne_66;

import java.math.BigInteger;
import java.util.Arrays;

class Solution {
    // for single digits
    public int[] plusOne(int[] digits) {
        StringBuilder temp = new StringBuilder();
        int[] result = new int[digits.length + 1];
        for (int digit : digits) {
            if (digit != 9) {
                result = new int[digits.length];
                break;
            }
        }

        for (int i = 0; i < digits.length; i++) {
            temp.append(digits[i]);
        }
        BigInteger convertedInt = new BigInteger(temp.toString());

        temp.setLength(0);
        temp.append(convertedInt.add(BigInteger.ONE));

        for (int i = 0; i < temp.length(); i++) {
            result[i] = Integer.parseInt(String.valueOf(temp.toString().charAt(i)));
        }
        return result;
    }

    public int[] plusSingle(int[] digits) {
        int n = digits.length;
        for (int i = n - 1 ; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] new_number = new int[n + 1];
        new_number[0] = 1;
        return new_number;
    }

}