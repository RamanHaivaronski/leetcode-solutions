package Trees.BinaryTrees.BalancedBinaryTree_110;

import Trees.BinaryTrees.TreeNode;

class Solution {

    private int leftLength = 0;
    public boolean isBalancedMasterpiece(TreeNode root) {
        if (root == null) {
            return true;
        }
        return calculateLength(root.left) == calculateLength(root.right) ||
                calculateLength(root.left) == calculateLength(root.right) - 1 ||
                calculateLength(root.left) - 1 == calculateLength(root.right);
    }
    public int calculateLength(TreeNode root) {
        if (root == null) {
            return leftLength;
        }
        if (root.left == null && root.right == null) {
            return leftLength;
        }
        leftLength++;
        if (calculateLength(root.left) > calculateLength(root.right)) {
            return calculateLength(root.left);
        } else {
            return calculateLength(root.right);
        }
    }

    // O(n) bottom up solution
    private boolean result = true;
    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return result;
    }

    // MAX DEPTH of binary tree!
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (Math.abs(l - r) > 1)
            result = false;
        return 1 + Math.max(l, r);
    }
}

