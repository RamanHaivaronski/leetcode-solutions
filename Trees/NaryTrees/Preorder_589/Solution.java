package Trees.NaryTrees.Preorder_589;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }


        stack.add(root);
        while (!stack.isEmpty()) {
            //poll top of the stack
            Node node = stack.pollLast();
            //add = add to the start of the linked list
            result.add(node.val);

            Collections.reverse(node.children);

            // take next level children of the tree to the stack
            for(Node child: node.children) {
                stack.add(child);
            }
        }

        return result;
    }
}