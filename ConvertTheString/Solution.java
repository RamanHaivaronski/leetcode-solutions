package ConvertTheString;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    // map with key insertion
    public char[] convertTheString(char[] word) {
        char[] result = new char[0];

        //Collections.reverse(List.of(word));

        String test = new String(word);
        String[] che = test.split(" ");

        StringBuilder reversed = new StringBuilder();

        for (int i = che.length; i > 0; i--) {
            reversed.append(che[i - 1]).append(" ");
        }

        String[] reversedArray = reversed.toString().split(" ");

        System.out.println(Arrays.toString(reversedArray));

        result = String.join(" ", reversedArray).toCharArray();

        return result;
    }
}