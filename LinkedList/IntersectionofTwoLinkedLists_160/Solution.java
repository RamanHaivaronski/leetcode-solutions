package LinkedList.IntersectionofTwoLinkedLists_160;

import LinkedList.ListNode;

public class Solution {

    //A [1,9,1,2,4]
    //B [3,2,4]
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //ListNode preHead = new ListNode(0);
        ListNode last = headB;
        if (headA == null || headB == null) {
            return null;
        }

        ListNode a_pointer = headA;
        ListNode b_pointer = headB;

        while(a_pointer != b_pointer) {
            if (a_pointer == null) {
                a_pointer = headB;
            } else {
                a_pointer = a_pointer.next;
            }

            if (b_pointer == null) {
                b_pointer = headA;
            } else {
                b_pointer = b_pointer.next;
            }
        }

        return a_pointer;
    }
}