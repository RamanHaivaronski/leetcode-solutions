package ExcelSheetColumnNumber_171;

import java.util.*;

//
class Solution {
    //
    public int titleToNumber(String columnTitle) {
        HashMap<Character, Integer> alphabet = new HashMap<>();
        alphabet.put('A', 1);alphabet.put('B', 2);alphabet.put('C', 3);alphabet.put('D', 4);alphabet.put('E', 5);alphabet.put('F', 6);alphabet.put('G', 7);
        alphabet.put('H', 8);alphabet.put('I', 9);alphabet.put('J', 10);alphabet.put('K', 11);alphabet.put('L', 12);alphabet.put('M', 13);
        alphabet.put('N', 14);alphabet.put('O', 15);alphabet.put('P', 16);alphabet.put('Q', 17);alphabet.put('R', 18);alphabet.put('S', 19);
        alphabet.put('T', 20);alphabet.put('U', 21);alphabet.put('V', 22);alphabet.put('W', 23);alphabet.put('X', 24);alphabet.put('Y', 25);alphabet.put('Z', 26);

        char[] values = columnTitle.toCharArray();
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            if (i == values.length - 1) {
                sum += alphabet.get(values[i]);
                return sum;
            }

            sum += alphabet.get(values[i]) * Math.pow(26, values.length - 1 - i);
        }

        return sum;
    }
}