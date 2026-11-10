/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode(-1);
        ListNode temp = list1 ;
        ListNode temp1 = list2 ;
        ListNode temp2 = node ;
        while(temp != null && temp1 != null){
            if(temp.val <= temp1.val){
                temp2.next = temp ;
                temp = temp.next ;
            }else{
                temp2.next = temp1 ;
                temp1 = temp1.next ;
            }
            temp2 = temp2.next ;
        }
        if(temp == null){
            temp2.next = temp1 ;
        }
        if(temp1 == null){
            temp2.next = temp ;
        }
        return node.next ;
    }
}
