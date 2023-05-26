package Trees.NaryTrees.Preorder_589;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Integer> result = s.preorder(new Node(1,
                Arrays.asList(new Node(3,
                        Arrays.asList(new Node(6), new Node(8), new Node(2))))));

        System.out.println(result);
    }
}