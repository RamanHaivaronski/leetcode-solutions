package LinkedList.IntersectionofTwoLinkedLists_160;

import LinkedList.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode result = s.getIntersectionNode(new ListNode(1, new ListNode(9, new ListNode(3))), new ListNode(4, new ListNode(2, new ListNode(0, new ListNode(3)))));
        //ListNode result = s.getIntersectionNode(new ListNode(), new ListNode());

        System.out.println(result);
    }
}