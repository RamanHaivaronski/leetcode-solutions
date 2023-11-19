package MostCommonWord_819;

import java.util.*;
import java.util.stream.Stream;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();

        String[] wordArray = paragraph.split(" ");
        List<String> listOfWords = new ArrayList<>();
        Collections.addAll(listOfWords, wordArray);

        Map<String, Integer> freq = new HashMap<>();

        for (String elem: listOfWords) {
            for (String bannedWord: banned) {
                if (!elem.equals(bannedWord)) {
                    freq.put(elem, freq.getOrDefault(elem, 0) + 1);
                }
            }
        }

//        Map.Entry<String, Integer> maxEntry = freq.(listOfWords.get(0));
//        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
//            if (entry.getValue() > maxEntry.getValue()) {
//                maxEntry = entry;
//            }
//        }
        return paragraph;
    }
}