package DP.Triangles_120;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.minimumTotalDP(List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3))); //7

        System.out.println(result);
    }
}