package LinkedList;

import classes.*;
public class RemoveNthFromLast {

    public ListNode RemoveNthFromLast(ListNode head, int n) {
        ListNode list = new ListNode(0);
        list.next = head;
        ListNode p = list.next;
        int size = head.size();
         //System.out.println(size);

            int nth = size-n;
        for (int i = 0; i < nth-1; i++) {
            p = p.next;

        }
    p.next = p.next.next;
        System.out.println(p.val);

            System.out.println(p.next.val);




        return list.next;
    }



    }

