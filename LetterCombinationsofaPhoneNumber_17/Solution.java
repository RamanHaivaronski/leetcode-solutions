package LetterCombinationsofaPhoneNumber_17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<String> letterCombinations1(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        HashMap<Character, String> keyboard = new HashMap<>();
        keyboard.put('2', "abc");
        keyboard.put('3', "def");
        keyboard.put('4', "ghi");
        keyboard.put('5', "jkl");
        keyboard.put('6', "mno");
        keyboard.put('7', "pqrs");
        keyboard.put('8', "tuv");
        keyboard.put('9', "wxyz");

        int length = digits.length();

        List<String> data = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            String values = keyboard.get(digits.charAt(i));
            data.add(values);
        }

        for (int i = 0; i < data.size(); i++) {

        }
        return result;
    }

    public static List<String> letterCombinations(String digits) {
        String[] digitletter = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            result = combine(digitletter[digits.charAt(i) - '0'], result);
        }

        return result;
    }

    public static List<String> combine(String digit, List<String> l) {
        List<String> result = new ArrayList<>();

        for (int i=0; i < digit.length(); i++) {
            for (String x : l) {
                result.add(x + digit.charAt(i));
            }
        }

        return result;
    }
}