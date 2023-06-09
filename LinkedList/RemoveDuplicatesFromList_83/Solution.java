package LinkedList.RemoveDuplicatesFromList_83;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode result = head;
        while(result != null && result.next != null) {
            if(result.val == result.next.val) {
                // skip duplicate
                result.next = result.next.next;
            } else {
                //regular traversal of Linked List
                result = result.next;
            }

        }
        return head;
    }
}