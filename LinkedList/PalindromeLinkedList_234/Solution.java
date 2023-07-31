package LinkedList.PalindromeLinkedList_234;

import LinkedList.ListNode;

public class Solution {

    // not all testcases
    public boolean isPalindrome1(final ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode original = head;
        ListNode result = null;
        while (original != null) {
            ListNode next = original.next;
            original.next = result;
            result = original;
            original = next;
        }
        return head == result;
    }

    // two pointers
    public boolean isPalindrome(final ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = reversed(slow);
        fast = head;


        while (slow != null) {
            if (slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }
    public ListNode reversed(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
         return prev;
    }

}