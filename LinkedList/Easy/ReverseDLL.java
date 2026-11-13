class Solution {
    public Node reverse(Node head) {
        if((head == null) || (head.next == null)) return head ;
        Node temp = head ;
        while(temp.next != null){
            Node t = temp.prev ;
            temp.prev = temp.next ;
            temp.next = t ;
            temp = temp.prev ;
        }
        Node t = temp.prev ;
        temp.prev = temp.next ;
        temp.next = t ;
        return temp ;
    }
}
