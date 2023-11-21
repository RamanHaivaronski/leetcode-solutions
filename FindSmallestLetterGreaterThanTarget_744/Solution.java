package FindSmallestLetterGreaterThanTarget_744;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char result = letters[0];

        for (char c: letters) {
            if (c > target) {
                result = c;
                break;
            }
        }

        return result;
    }
}