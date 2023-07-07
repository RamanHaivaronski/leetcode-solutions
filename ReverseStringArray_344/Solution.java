package ReverseStringArray_344;

public class Solution {
    public void reverseString(char[] s) {
        char saver;
        for (int i = 0; i < s.length / 2; i++) {
            saver = s[s.length - 1 - i];
            s[s.length - 1 - i] = s[i];
            s[i] = saver;
        }
    }

}


