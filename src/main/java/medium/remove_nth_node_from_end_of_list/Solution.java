package medium.remove_nth_node_from_end_of_list;

import base_classes.ListNode;

import java.util.Arrays;

public class Solution {

    // my approach of solving this task, using instance int length and one additional helper method
    private int length = 0;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (length == 0) length = size(head);
        if (n == length) head = head.next;
        if (head == null) return null;
        return new ListNode(head.val, removeNthFromEnd(head.next, n+1));
    }
    private int size(ListNode head){
        if (head == null) return 0;
        return 1 + size(head.next);
    }
    // as a result I am creating a new ListNode object and iterating two times through linked list:
    // first time to count size of list, second time to actually create a output.


    // Below lines are just my experiments
    Integer number = 0;
    public Integer change(Integer num) {
        number = num;
        num = num*2;
        return number;
    }
    StringBuilder outerOne;
    public StringBuilder changeSB(StringBuilder sb) {
        outerOne = sb;
        sb.append("aaa");
        return outerOne;
    }
    // Above lines are just my experiments


    // one genius guy's solution:
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1 = ListNode.createLinkedList(Arrays.asList(1,2,3,4,5,6,7,8), 0);
        System.out.println(solution.removeNthFromEnd(list1, 3));
        System.out.println(solution.removeNthFromEnd2(list1, 4));

        System.out.println(solution.change(14));
        System.out.println(solution.number);

        System.out.println(solution.changeSB(new StringBuilder("flow")));
        System.out.println(solution.outerOne);
    }
}
