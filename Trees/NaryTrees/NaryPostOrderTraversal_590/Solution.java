package Trees.NaryTrees.NaryPostOrderTraversal_590;

import java.util.LinkedList;
import java.util.List;

class Solution {

    //Complexity O(n)
    public List<Integer> postTraversal(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }


        stack.add(root);
        while (!stack.isEmpty()) {
            //poll top of the stack
            Node node = stack.pollLast();
            //addFirst = add to the end of the linked list
            result.addFirst(node.val);
            // take next level children of the tree to the stack
            for(Node child: node.children) {
                stack.add(child);
            }
        }

        return result;
    }
}