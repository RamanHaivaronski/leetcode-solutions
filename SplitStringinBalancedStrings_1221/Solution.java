package SplitStringinBalancedStrings_1221;

import java.util.Stack;

public class Solution {
    public int balancedStringSplit(String s) {
        int result = 0;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.size() == 0) {
                stack.push(s.charAt(i));
            } else {
                if (stack.peek() == s.charAt(i)) {
                    stack.push(s.charAt(i));
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        result++;
                    }

                }
            }
        }

        return result;
    }
}