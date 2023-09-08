package ImageOverlap_835;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.largestOverlap(new int[][]{{1,1,0}, {0,1,0}, {0,1,0}}, new int[][]{{0,0,0}, {0, 1, 1}, {0, 0, 1}});

        System.out.println(result);
    }
}