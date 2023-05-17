package LinkedList.RemoveLinkedListElements_203;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode result = head;


        while(result != null && result.next != null) {
            if(result.next.val == val) {
                result.next = result.next.next;
            } else {
                result = result.next;
            }

        }
        return result;
    }

}