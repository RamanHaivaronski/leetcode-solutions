package ReverseVowels_345;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('A');
        vowels.add('o');
        vowels.add('O');
        vowels.add('i');
        vowels.add('I');
        vowels.add('u');
        vowels.add('U');
        //vowels.add('Y');
        //vowels.add('y');
        vowels.add('e');
        vowels.add('E');

        char first;
        char saver;
        char[] array = s.toCharArray();
        int count = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (vowels.contains(array[i])) {
                first = array[i];

                for (int j = count; j > i; j--) {
                    count--;
                    if (vowels.contains(array[j])) {
                        saver = array[j];
                        array[j] = first;
                        array[i] = saver;
                        break;
                    }
                }
            }
        }
        s = String.valueOf(array);
        return s;
    }

}


