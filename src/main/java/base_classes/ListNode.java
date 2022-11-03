package base_classes;

import java.util.List;

public class ListNode {
    public ListNode next;
    public int val;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this(val);
        this.next = next;
    }

    public static ListNode createLinkedList(List<Integer> list, int start) {
        if (start == list.size()) return null;
        return new ListNode(list.get(start), createLinkedList(list, start+1));
    }


    private static int printHelper;
    @Override
    public String toString() {
        String bracket1 = "";
        String bracket2 = "";
        if(printHelper == 0) bracket1 = "[";
        printHelper++;
        if(next == null) {
            bracket2 = "]";
            printHelper = 0;
        }
        return bracket1 +
                ((next == null) ? (val + "") : (val + ", " + next))
                + bracket2;
    }
}
