package LinkedList.ReverseLinkedList_206;

import LinkedList.ListNode;

public class Solution {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode result = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = result;
            result = head;
            head = next;
        }
        return result;
    }
}