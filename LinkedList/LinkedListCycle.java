package LinkedList;

import classes.*;

public class LinkedListCycle {
    public ListNode LinkedListCycle(ListNode head){
        //System.out.println(head.val);
        ListNode slow = head;
        ListNode fast = head;
        //System.out.println(fast.next.val);
        ListNode check = slow;
        if(head==null || head.next==null) return head;
        while(fast!= null && fast.next!=null) {

            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast) return fast;
        }

        while(check.next!=null) {
            if(slow==check.next) return slow.next;
        }
        return fast;
    }

    public static void main(String[] args) {
        LinkedListCycle cycle = new LinkedListCycle();
        ListNode list = new ListNode(1);

        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(1);
        System.out.println(cycle.LinkedListCycle(list));


    }


}
