package LinkedList.PalindromeLinkedList_234;

import LinkedList.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        boolean result = s.isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1)))));
        //ListNode result = s.getIntersectionNode(new ListNode(), new ListNode());

        System.out.println(result);
    }
}