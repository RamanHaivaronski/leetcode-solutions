package GroupAnagrams_49;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<String>> result = s.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});

        System.out.println(result);
    }
}