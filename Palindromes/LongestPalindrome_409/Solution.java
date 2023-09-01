package Palindromes.LongestPalindrome_409;

import java.util.HashMap;
import java.util.Map;

class Solution {

    //my
    public int longestPalindrome(String s) {

        int res = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!freq.containsKey(s.charAt(i))) {
                freq.put(s.charAt(i), 1);
            } else {
                freq.put(s.charAt(i), freq.get(s.charAt(i)) + 1);
            }
        }

        int maxOdd = 0;
        for (Map.Entry<Character, Integer> set : freq.entrySet()) {
            if (set.getValue() % 2 == 0) {
                res += set.getValue();
            } else {
                if (set.getValue() > maxOdd) {
                    maxOdd = set.getValue();
                }
            }
        }

        return res + maxOdd;
    }

    //solved
    public int longestPalindrome1(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int palindromeSize = 0;
        for(int i =0 ; i<s.length();i++){
            int keyCount = map.getOrDefault(s.charAt(i),0);

            map.put(s.charAt(i),++keyCount);

            if (keyCount%2 == 0) palindromeSize +=2;

        }
        for (int size : map.values()){
            if (size%2==1){
                palindromeSize++;
                break;
            }
        }
        return palindromeSize;
    }
}