package StringMatchinginanArray_1408;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        if (words.length == 1) {
            result.add(words[0]);
            return result;
        }
        int currWord = 0;
        for (int i = 0; i < words.length; i++) {
            if (currWord == words.length) {
                break;
            }
             if (!words[i].equals(words[currWord]) && words[i].contains(words[currWord])) {
                 result.add(words[currWord]);
                 currWord++;
                 i = -1;
                 continue;
             }

             if (i == words.length - 1) {
                 currWord++;
                 i = -1;
             }
        }

        return result;
    }
}