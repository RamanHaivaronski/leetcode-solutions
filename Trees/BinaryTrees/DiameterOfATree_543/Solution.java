package Trees.BinaryTrees.DiameterOfATree_543;

import Trees.BinaryTrees.TreeNode;

class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }

    public int dfs(TreeNode node) {
        int left = 0;
        int right = 0;

        if (node.left != null) {
            left = dfs(node.left);
        }

        if (node.right != null) {
            right = dfs(node.right);
        }

        max = Math.max(max, left + right);

        return Math.max(left, right) + 1;
    }
}

