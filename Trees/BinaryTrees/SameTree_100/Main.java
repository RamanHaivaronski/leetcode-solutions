package Trees.BinaryTrees.SameTree_100;

import Trees.BinaryTrees.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        boolean result = s.isSameTree(new TreeNode(1,
                new TreeNode(3,new TreeNode(7), new TreeNode(2)),
                new TreeNode(5,new TreeNode(9), new TreeNode(10))),
                new TreeNode(1,
                        new TreeNode(3,new TreeNode(7), new TreeNode(2)),
                        new TreeNode(5,new TreeNode(9), new TreeNode(10))));

        System.out.println(result);
    }
}