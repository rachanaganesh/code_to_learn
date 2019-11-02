/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
             return null;
        }
        
        //Create a copy of the nodes in the CloneMap without their links
 
        Map<Node, Node> map = new HashMap<>();
        Node curr = head;
        while(curr!=null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        
        //Now link the next pointer values in the CloneMap created and then its randon pointer
        
        curr = head;
        while(curr!=null){
            //map.get(curr).next = "sets the 1's next pointer"
            //map.get(curr.next) = " The clone of curr's next"
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        
        return map.get(head);
    }
}