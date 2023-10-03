package KeyboardRow_500;

import java.util.*;

public class Solution {
    public String[] findWords(String[] words) {
        Map<Character, Integer> letters = new HashMap<>();

        letters.put('q', 1);
        letters.put('w', 2);
        letters.put('e', 3);
        letters.put('r', 4);
        letters.put('t', 5);
        letters.put('y', 6);
        letters.put('u', 7);
        letters.put('i', 8);
        letters.put('o', 9);
        letters.put('p', 10);

        letters.put('a', 11);
        letters.put('s', 12);
        letters.put('d', 13);
        letters.put('f', 14);
        letters.put('g', 15);
        letters.put('h', 16);
        letters.put('j', 17);
        letters.put('k', 18);
        letters.put('l', 19);

        letters.put('z', 20);
        letters.put('x', 21);
        letters.put('c', 22);
        letters.put('v', 23);
        letters.put('b', 24);
        letters.put('n', 25);
        letters.put('m', 26);

        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            Character firstLetter = words[i].charAt(0);
            firstLetter = Character.toLowerCase(firstLetter);
            int value = letters.get(firstLetter);

            for (int j = 0; j < words[i].length(); j++) {
                Character letter = words[i].charAt(j);
                letter = Character.toLowerCase(letter);

                if (j == words[i].length() - 1 && (
                        (value < 11 && letters.get(letter) < 11)
                        || (value < 20  && value > 10 && letters.get(letter) < 20 && letters.get(letter) > 10)
                        || (value > 19 && letters.get(letter) > 19))) {
                    result.add(words[i]);
                }

                if (value < 11 && letters.get(letter) < 11) {
                    continue;
                } else if (value < 20 && value > 10 && letters.get(letter) < 20 && letters.get(letter) > 10) {
                    continue;
                } else if (value > 19 && letters.get(letter) > 19) {
                    continue;
                }
                break;
            }

        }
        Object[] gfg = result.toArray();

        return Arrays.copyOf(gfg, gfg.length, String[].class);
    }
}