package SimplifyPath_71;

import java.util.*;

public class Solution {
    public String simplifyPath1(String path) {

        StringBuilder sb = new StringBuilder(path);
        if (!path.startsWith("/")) {
            sb.insert(0,'/');
        }
        if(path.endsWith("/")) {
            sb.deleteCharAt(path.length() - 1);
        }
        for(int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i + 1) == '.') {
                sb.deleteCharAt(i + 1);
                i = -1;
                continue;
            }
            if (sb.charAt(i) == '.') {
                sb.deleteCharAt(i);
                i = -1;
                continue;
            }
            if ((sb.charAt(i) == '/' && sb.charAt(i + 1) == '/') ||
                sb.charAt(i) == '.') {
                sb.deleteCharAt(i);
                i = -1;
            }
        }
        return  sb.toString();
    }

    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));
        for (String dir : path.split("/")) {
            if (dir.equals("..") && !stack.isEmpty()) {
                stack.pop();
            } else if (!skip.contains(dir)) {
                stack.push(dir);
            }
        }
        String res = "";
        for (String dir : stack) {
            res = "/" + dir + res;
        }
        return res.isEmpty() ? "/" : res;
    }
}