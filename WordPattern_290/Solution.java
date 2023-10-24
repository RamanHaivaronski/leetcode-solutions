package WordPattern_290;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> words = new HashMap<>();

        String[] test = s.split(" ");
        if (test.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (!words.containsKey(pattern.charAt(i)) && !words.containsValue(test[i])) {
                words.put(pattern.charAt(i), test[i]);
            } else {
                if (!Objects.equals(words.get(pattern.charAt(i)), test[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}