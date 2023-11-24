package MostCommonWord_819;

import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();

        String symbols="!?',;.";

        for(int i=0;i<symbols.length();i++){
            char temp=symbols.charAt(i);
            paragraph=paragraph.replace(temp,' ');
        }

        List<String> words = new ArrayList<>(Arrays.asList(paragraph.split(" ")));

        for (Iterator<String> iterator = words.iterator(); iterator.hasNext(); ) {
            String elem = iterator.next();
            if ("".equals(elem)) {
                iterator.remove();
            }
        }

        for (Iterator<String> iterator = words.iterator(); iterator.hasNext();) {
            String elem = iterator.next();
            for (int j = 0; j < banned.length; j++) {
                if (banned[j].equals(elem)) {
                    iterator.remove();
                }
            }
        }

        int maxCount = 0;
        String result = "";

        for (int i = 0; i < words.size(); i++) {
            int tempCount = 0;
            for (int j = 0; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))) {
                    tempCount++;
                }
            }
            if (tempCount > maxCount) {
                maxCount = tempCount;
                result = words.get(i);
            }
        }

        return result;
    }
}