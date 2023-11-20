package RotateString_796;

public class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            if (sb.toString().equals(goal)) {
                return true;
            } else {
                sb.append(s.charAt(i));
                sb.delete(0, 1);
            }
        }

        return false;
    }
}