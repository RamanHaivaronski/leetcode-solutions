package NumberofSegmentsinaString_434;

class Solution {
    public int countSegments(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.isBlank()) {
            return 0;
        } else if (s.length() == 1 && s.charAt(0) != ' ') {
            return 1;
        }

        int result = 0;

        s = s.trim();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != ' ' && s.charAt(i+1) == ' ') {
                result++;
            }
        }

        return result + 1;
    }
}