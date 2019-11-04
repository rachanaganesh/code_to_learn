public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentList1 = headA;
        ListNode currentList2 = headB;
        
        while(currentList1!=null || currentList2!=null){
            if(currentList1!=null){
            currentList1 = currentList1.next;
            }
            else {
                headB = headB.next;
            }
            if(currentList2!=null){
                currentList2 = currentList2.next;
            }
            else {
                headA = headA.next;
            }
            
        } 
        while(headA!=headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
        
    }
}