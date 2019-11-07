package LinkedList;

import LinkedList.DeleteMiddleElementLinkedList;
import classes.*;
public class Main {

    public static void main(String[] args) {

        // String.OneAway problem : CTCI problem
        /*System.out.println("Hello World!");
        String.OneAway one = new String.OneAway();
        System.out.println(one.OneEditAway("pale", "pae"));*/

        //String Compression problem: CTCI problem
       /* String.StringComparision comp = new String.StringComparision();
       System.out.println(comp.Compressed("abc"));*/

        //String rotation problem: CTCI problem
       // String.stringRotation comp = new String.stringRotation();
      //  LinkedList.RemoveNthFromLast remove = new LinkedList.RemoveNthFromLast();

      // System.out.println(comp.rotate("abcde","bcdea"));
       ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
//        ListNode printList = remove.LinkedList.RemoveNthFromLast(list,3);

        DeleteMiddleElementLinkedList delete = new DeleteMiddleElementLinkedList();
        System.out.println(delete.DeleteMiddleElementLinkedList(list));


    }
}
