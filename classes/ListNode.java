package classes;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }
    public int size() {
        int size = 0;
        for(ListNode n1 = this; n1 != null; n1 = n1.next)
            size++;
        return size;
    }
}