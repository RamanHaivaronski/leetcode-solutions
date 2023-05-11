package CommonPrefix_14;

import java.util.Arrays;
import java.util.Objects;

public class FollowUpSolution {
    public String longestCommonPrefix (String[] strs) {
        String result = "";

        if (strs.length == 0 || Objects.equals(strs[0], "")) {
            return result;
        }
        if (strs.length == 1) {
            return strs[0];
        }
        Arrays.sort(strs);

        int counter = 0;
        String smallestWord = strs[0];
        while (counter < smallestWord.length()) {
            if (smallestWord.charAt(counter) == strs[strs.length - 1].charAt(counter)) {
                counter++;
            } else {
                break;
            }
        }

        return smallestWord.substring(0, counter);
    }
}
