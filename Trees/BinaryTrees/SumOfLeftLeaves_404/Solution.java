package Trees.BinaryTrees.SumOfLeftLeaves_404;

import Trees.BinaryTrees.TreeNode;

import java.util.*;

class Solution {
    //Complexity O(n)
    public int sumOfLeftLeaves1(TreeNode root) {
        int result = 0;
        if (root == null || (root.left == null && root.right == null)) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            if(current.left!=null) {
                if(current.left.left==null && current.left.right==null) {
                    result += current.left.val;
                }
                stack.push(current.left);
            }

            if (current.right != null) {
                stack.push(current.right);
            }
        }
        return result;
    }
}