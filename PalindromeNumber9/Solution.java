package PalindromeNumber9;
public class Solution {
    //My solution brute force
    // Convert to String
    // Reverse
    // Compare
    public boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        StringBuilder builder = new StringBuilder(value);

        if (value.compareTo(builder.reverse().toString()) == 0) {
            return true;
        }
        return false;
    }

    //Solution without StringBuilder
    public boolean isPalindromeNoSb(int x) {
        String s = String.valueOf(x);
        int n = s.length();

        for (int i = 0; i < n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }

        return true;
    }

    //Solution without the String
    public boolean isPalindromeOptimal(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int rev = 0;
        while (x > rev){
            rev = rev * 10 + x % 10;
            x = x / 10;
        }

        return (x == rev || x == rev / 10);
    }


}