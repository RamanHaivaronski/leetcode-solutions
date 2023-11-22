package ShortestCompletingWord_748;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        //Store count of letters in LicensePlate
        int[] licensePlateCount = new int[26];
        //To store all words which meet the criteria
        List<String> res = new ArrayList<>();
        //To find min length word that meets the criteria
        int min = Integer.MAX_VALUE;
        //Add char count for each char in LicensePlate
        for(Character c:licensePlate.toCharArray()) {
            if(Character.isLetter(c)) {
                licensePlateCount[Character.toLowerCase(c) - 'a']++;
            }
        }
        //Add char count for each word in words
        for(String word : words) {
            int[] wordCharCount = new int[26];
            boolean flag = true;
            for(Character c:word.toCharArray()) {
                wordCharCount[Character.toLowerCase(c) - 'a']++;
            }
            //Eliminate words that don't satisfy the criteria
            for(int i = 0; i < 26; i++) {
                if(licensePlateCount[i] > wordCharCount[i]) {
                    flag = false;
                }
            }
            //Add words satisfying criteria to res and calculate min word length
            if(flag) {
                res.add(word);
                if(word.length() < min) {
                    min = word.length();
                }
            }
        }
        //Return 1st word in array meeting all criteria
        for (String re : res) {
            if (re.length() == min) {
                return re;
            }
        }
        //If not found, return -1 (or whatever interviewer expects)
        return "-1";
    }
}