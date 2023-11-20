package UniqueMorseCodeWords_804;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] lettersMorse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Character[] letters = new Character[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Map<Character, String> letterMap = new HashMap<>();

        for (int i = 0; i < letters.length; i++) {
            letterMap.put(letters[i], lettersMorse[i]);
        }
        List<String> combinations = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.setLength(0);
            for (int j = 0; j < words[i].length(); j++) {
                sb.append(letterMap.get(words[i].charAt(j)));
            }
            if (!combinations.contains(sb.toString())) {
                combinations.add(sb.toString());
            }
        }

        return combinations.size();
    }
}