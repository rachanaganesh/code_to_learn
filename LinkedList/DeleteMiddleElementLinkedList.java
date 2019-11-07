package LinkedList;

import  classes.*;

public class DeleteMiddleElementLinkedList {
    public ListNode DeleteMiddleElementLinkedList(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.next;
    }
}
