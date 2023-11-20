package DecodeWays_91;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int numDecodings1(String s) {

        if (s.startsWith("0")) {
            return 0;
        }

        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), s, s.length(), 0);
        return list.size();
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, String word, int remain, int start){
        if (remain < 0) {
            return;
        } else if (remain == 0) {
            list.add(new ArrayList<>(tempList));
        } else {
            for(int i = start; i < word.length(); i++){
                if (word.charAt(i) != '0') {
                    tempList.add(word.charAt(i) - '0');
                } else {
                    tempList.remove(tempList.size() - 1);
                    tempList.add(i);
                }
                backtrack(list, tempList, word, remain - 1, i + 1); // not i + 1 because we can reuse same elements
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public int numDecodings(String s) {
        int dp1 = 1, dp2 = 0, n = s.length();
        for(int i = n-1; i >= 0; i--) {
            int dp = s.charAt(i) == '0' ? 0 : dp1;
            if(i < n-1 && (s.charAt(i) == '1'|| s.charAt(i) == '2' && s.charAt(i+1) < '7')) {
                dp += dp2;
            }
            dp2 = dp1;
            dp1 = dp;
        }
        return dp1;
    }

}