package Trees.BinaryTrees.ListToTree_108;

import Trees.BinaryTrees.TreeNode;

class Solution {

    //Complexity O(n)
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return constructTheTree(nums, 0, nums.length-1);
    }

    public TreeNode constructTheTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int midpoint = left + (right - left) / 2;
        TreeNode result = new TreeNode(nums[midpoint]);
        result.left = constructTheTree(nums, left, midpoint - 1);
        result.right = constructTheTree(nums, midpoint + 1, right);

        return result;
    }

}