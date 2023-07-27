package LinkedList.ReverseLinkedList_206;

import LinkedList.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode result = s.reverseList(new ListNode(1, new ListNode(9, new ListNode(3))));
        //ListNode result = s.getIntersectionNode(new ListNode(), new ListNode());

        System.out.println(result);
    }
}