package easy.merge_two_sorted_arrays;

import base_classes.ListNode;

public class Solution1 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list2 == null && list1 == null) return null;

        if (list2 == null || (list1 != null && list1.val <= list2.val))
            return new ListNode(list1.val, mergeTwoLists(list1.next, list2));
        else
            return new ListNode(list2.val, mergeTwoLists(list1, list2.next));
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println("[" + new Solution1().mergeTwoLists(list1, list2) + "]");
    }
}
