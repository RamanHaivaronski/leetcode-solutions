package GroupAnagrams_49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        if (strs.length == 0) {
            return result;
        }
        List<String> temp = new ArrayList<>();
        temp.add(strs[0]);
        result.add(temp);
        if (strs.length == 1) {
            return result;
        }

        boolean wasAdded = false;
        for (int i = 1; i < strs.length; i++) {
            wasAdded = false;
            for (int j = 0; j < result.size(); j++) {
                if (wasAdded) {
                    break;
                } else if (!wasAdded && isAnagram(result.get(j).get(0), strs[i])) {
                    result.get(j).add(strs[i]);
                    wasAdded = true;
                } else if (j == result.size() - 1) {
                    List<String> temp1 = new ArrayList<>();
                    temp1.add(strs[i]);
                    result.add(temp1);
                    break;
                }
            }
        }
        return result;
    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}