package LinkedList.RemoveDuplicatesFromList_83;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode result = s.deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(6,
                new ListNode(3, new ListNode(4, new ListNode(6, new ListNode(6))))))));

        System.out.println(result.toString());
    }
}