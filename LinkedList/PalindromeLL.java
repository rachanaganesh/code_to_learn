package LinkedList;

import classes.*;

public class PalindromeLL {
    public boolean isPalindrome(ListNode head) {
      //  System.out.println(head.val);
        String str = "";
            str += head.val;
            str += head.next.val;
            //System.out.println(str);

        return isPalUntil(str);
    }
public boolean isPalUntil(String s) {
    System.out.println(s);
    String isPal = "";
    int length = s.length();

        return false;
}

    public static void main(String[] args) {
        PalindromeLL p = new PalindromeLL();
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        System.out.println(p.isPalindrome(node));
    }
}
