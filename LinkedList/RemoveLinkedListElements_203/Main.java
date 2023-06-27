package LinkedList.RemoveLinkedListElements_203;

import LinkedList.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode result = s.removeElements(new ListNode(1, new ListNode(2, new ListNode(6,
                new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))))), 6);
        //ListNode result = s.removeElements(new ListNode(), 4);
    }
}