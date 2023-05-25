package Trees.BinaryTrees.PostorderTraversal_145;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Integer> result = s.postorderTraversal(new TreeNode(1,
                new TreeNode(3,new TreeNode(7), new TreeNode(2)),
                new TreeNode(5,new TreeNode(9), new TreeNode(10))));

        System.out.println(result);
    }
}