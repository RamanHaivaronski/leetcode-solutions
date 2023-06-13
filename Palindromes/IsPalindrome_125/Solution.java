package Palindromes.IsPalindrome_125;

class Solution {
    public boolean isPalindrome(String s) {
        boolean result = false;

        if (s.length() == 1) {
            return true;
        }
        if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            return true;
        }

        String regex = "[^a-zA-Z0-9]+";   //alphanumeric
        String convertedString = s.replaceAll(regex, "").toLowerCase();
        StringBuilder test = new StringBuilder(convertedString);

        if (convertedString.compareTo(test.reverse().toString()) == 0) {
            return true;
        }
        return result;
    }
}