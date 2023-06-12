package Trees.BinaryTrees.MaximumDepth_104;

//Bottom-up solution
// Complexity O(n)
class Solution {
    public int maxDepth(TreeNode root) {
        int result = 0;
        if (root == null) {
            return result;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }
}