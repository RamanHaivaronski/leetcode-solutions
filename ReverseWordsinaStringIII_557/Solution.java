package ReverseWordsinaStringIII_557;

public class Solution {
    public String reverseWords(String s) {
        String[] list = s.split(" ");

        StringBuilder result = new StringBuilder();

        for (String elem: list) {
            StringBuilder sb = new StringBuilder();
            sb.append(elem).reverse();
            result.append(sb).append(" ");
        }

        return result.toString().trim();
    }
}