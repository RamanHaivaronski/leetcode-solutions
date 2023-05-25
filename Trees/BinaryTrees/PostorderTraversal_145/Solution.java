package Trees.BinaryTrees.PostorderTraversal_145;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    //Complexity O(n)
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            TreeNode current = stack.pop();
            result.add(0, current.val);
            if (current.left != null) {
                stack.push(current.left);
            }
            if (current.right != null) {
                stack.push(current.right);
            }
        }
        return result;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            //traverse to the left subtree
            while (current != null) {
                //put root node to result array
                result.add(current.val);
                // traverse to left
                stack.push(current);
                current = current.left;
            }
            //pop root node
            current = stack.pop();


            //traverse to right subtree
            current = current.right;

        }
        return result;
    }
}