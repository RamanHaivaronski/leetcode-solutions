package FindCommonCharacters_1002;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> commonChars(String[] words) {

        List<String> result = new ArrayList<>();

        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < words[0].length(); i++) {
            freq.put(words[0].charAt(i), freq.getOrDefault(words[0].charAt(i),0) + 1);
        }

        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> temp = new HashMap<>(freq);
            for (int j = 0; j < words[i].length(); j++) {
                if (temp.containsKey(words[i].charAt(j))) {
                    temp.put(words[i].charAt(j), temp.getOrDefault(words[i].charAt(j),0) - 1);
                } else {
                    if (freq.get(words[i].charAt(j)) != null) {
                        freq.put(words[i].charAt(j), freq.getOrDefault(words[i].charAt(j),0) - 1);
                    }

                }
            }
            for (Map.Entry<Character, Integer> entry: temp.entrySet()) {
                if (entry.getValue() > 0) {
                    for (int j = 0; j < entry.getValue(); j++) {
                        freq.put(entry.getKey(), freq.getOrDefault(entry.getKey(),0) - 1);
                    }
                }
            }
        }

        for (Map.Entry<Character, Integer> entry: freq.entrySet()) {
            if (entry.getValue() > 0) {
                for (int i = 0; i < entry.getValue(); i++) {
                    result.add(entry.getKey().toString());
                }
            }
        }

        return result;
    }
}