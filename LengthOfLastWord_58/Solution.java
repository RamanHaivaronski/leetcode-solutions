package LengthOfLastWord_58;

public class Solution {
    public int lengthOfLastWord(String s) {

        //my solution
        if (s.length() == 1) {
            return 1;
        }
        if (s.length() == 2 && s.charAt(0) == ' ') {
            return 1;
        } else if (s.length() == 2 && s.charAt(1) == ' '){
            return 1;
        }
        if (!s.contains(" ")) {
            return s.length();
        }
        int lastIndex = 0;
        boolean lastFound = false;

        char[] arr = s.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!lastFound && arr[i] != ' ') {
                lastIndex = i;
                lastFound = true;
            }
            if (arr[i] != ' ' && (i == 0 || arr[i-1] == ' ')) {
                return lastIndex - i + 1;
            }
        }
        return 0;
    }

    //optimal solution;
    public int lengthOfLastWord1(String s) {
        int length = 0;

        // We are looking for the last word so let's go backward
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') { // a letter is found so count
                length++;
            } else {  // it's a white space instead
                //  Did we already started to count a word ? Yes so we found the last word
                if (length > 0) return length;
            }
        }
        return length;
    }
}