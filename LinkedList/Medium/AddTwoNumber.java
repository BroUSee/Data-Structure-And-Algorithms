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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode temp1 = l1 ;
        ListNode temp2 = l2 ;
        ListNode temp3 = l3 ;
        int carry = 0 ;
     while (temp1 != null && temp2 != null) {
            if(temp1.val + temp2.val + carry >= 10){
                temp3.val = (temp1.val + temp2.val + carry) % 10 ;
                carry = 1 ;
            }else{
                temp3.val = (temp1.val + temp2.val + carry) % 10 ;
                carry = 0 ;
            }
            temp1 = temp1.next ;
            temp2 = temp2.next ;
            if(temp1 != null && temp2 != null){
                ListNode t = new ListNode();
                temp3.next = t ;
                temp3 = temp3.next ;
            }
        }
        if(temp1 != null){
            while (temp1 != null) {
                if(temp1 != null){
                    ListNode t = new ListNode();
                    temp3.next = t ;
                    temp3 = temp3.next ;
                }
                if(temp1.val + carry >= 10){
                    temp3.val = (temp1.val + carry) % 10 ;
                    carry = 1 ;
                }else{
                    temp3.val = (temp1.val + carry) % 10 ;
                    carry = 0 ;
                }
                temp1 = temp1.next ;
            }
        }else{
            while (temp2 != null) {
                if(temp2 != null){
                    ListNode t = new ListNode();
                    temp3.next = t ;
                    temp3 = temp3.next ;
                }
                if(temp2.val + carry >= 10){
                    temp3.val = (temp2.val + carry) % 10 ;
                    carry = 1 ;
                }else{
                    temp3.val = (temp2.val + carry) % 10 ;
                    carry = 0 ;
                }
                temp2 = temp2.next ;
            }
        }
        if(carry == 1){
            ListNode t = new ListNode();
            temp3.next = t ;
            t.val = 1 ;
        }
        return l3 ;
    }
}
