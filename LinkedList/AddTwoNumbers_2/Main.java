package LinkedList.AddTwoNumbers_2;

import LinkedList.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode result = s.addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3))), new ListNode(5, new ListNode(6, new ListNode(4))));
        //ListNode result = s.mergeTwoLists(new ListNode(), new ListNode());

        System.out.println(result);
    }
}