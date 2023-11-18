package Palindromes.IsPalindrome_125;

class Solution {
    public boolean isPalindrome1(String s) {
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

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst )) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}