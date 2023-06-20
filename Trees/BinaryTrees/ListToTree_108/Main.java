package Trees.BinaryTrees.ListToTree_108;

import Trees.BinaryTrees.TreeNode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode result = s.sortedArrayToBST(new int[] {2, 3, 5, 6, 7,20});

        System.out.println(result);
    }
}