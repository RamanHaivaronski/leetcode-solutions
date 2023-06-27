package LinkedList.RemoveLinkedListElements_203;

import LinkedList.ListNode;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode result = head;


        while(result != null && result.next != null) {
            if(result.next.val == val) {
                // skip certain value
                result.next = result.next.next;
            } else {
                // regular traversal
                result = result.next;
            }

        }
        return result;
    }

}