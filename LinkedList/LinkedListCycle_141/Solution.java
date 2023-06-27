package LinkedList.LinkedListCycle_141;

import LinkedList.ListNode;

public class Solution {
    public boolean hasCycle(ListNode node) {

        if (node == null) {
            return false;
        }
        ListNode slow = node;
        ListNode fast = node.next;

        while(slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

}