package GenerateParentheses_22;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> output_arr = new ArrayList<>();
        backtrack(output_arr, "", 0, 0, n);
        return output_arr;
    }

    public void backtrack(List<String> output, String current, int open, int close, int max) {
        //base case
        if (current.length() == max * 2) {
            output.add(current);
            return;
        }
        //decisions
        if (open < max) {
            backtrack(output, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(output, current + ")", open, close + 1, max);
        }
    }

}