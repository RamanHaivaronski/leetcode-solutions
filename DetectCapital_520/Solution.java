package DetectCapital_520;



class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        }

        if (!Character.isUpperCase(word.charAt(0))) {
            for (int i = 0; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
                if (i == word.length() - 1) {
                    return true;
                }
            }
        } else {
            // all not cap
            if (!Character.isUpperCase(word.charAt(1))) {
                for (int i = 1; i < word.length(); i++) {
                    if (Character.isUpperCase(word.charAt(i))) {
                        return false;
                    }
                    if (i == word.length() - 1) {
                        return true;
                    }
                }
            } else {
                //all cap
                for (int i = 1; i < word.length(); i++) {
                    if (!Character.isUpperCase(word.charAt(i))) {
                        return false;
                    }
                    if (i == word.length() - 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}