package Trees.BinaryTrees.InOrderTraversal_94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {

    //Complexity O(n)
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            //traverse to the left subtree
            while(current != null) {
                stack.push(current);
                current = current.left;
            }
            //pop root node
            current = stack.pop();
            //put root node to result array
            result.add(current.val);

            //traverse to right subtree
            current = current.right;

        }
        return result;
    }
}