/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) return null ;
        Node dummy = new Node();
        helper(dummy , head);
        dummy.next.prev = null ;
        return dummy.next ;
    }

    public Node helper(Node dummy , Node head){
        Node temp = head ;
        Node dTemp = dummy ;
        while(temp != null){
            dTemp.next = temp ;
            temp.prev = dTemp ;
            dTemp = dTemp.next ;
            Node t = temp.next ;
            if(temp.child != null){
                dTemp = helper(dTemp , temp.child);
                temp.child = null ;
            }
            temp = t;
        }
        return dTemp ;
    }
}
