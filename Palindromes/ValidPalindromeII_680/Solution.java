package Palindromes.ValidPalindromeII_680;

class Solution {
    public boolean isPalindrome(String s) {
        int a_pointer = 0;
        int b_pointer = s.length() - 1;

        while (a_pointer <= b_pointer) {
            if (s.charAt(a_pointer) != s.charAt(b_pointer)) {
                //call helper method
                return isPalindromeAgain(s, a_pointer + 1, b_pointer) ||
                    isPalindromeAgain(s, a_pointer, b_pointer - 1);
            }

            a_pointer += 1;
            b_pointer -= 1;

        }
        return true;
    }

    public boolean isPalindromeAgain(String str, int s, int j) {
        int a_pointer = s;
        int b_pointer = j;

        while (a_pointer <= b_pointer) {
            if (str.charAt(a_pointer) != str.charAt(b_pointer)) {
                return false;
            }

            a_pointer += 1;
            b_pointer -= 1;

        }
        return true;
    }
}