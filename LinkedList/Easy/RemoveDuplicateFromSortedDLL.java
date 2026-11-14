class Solution {
    Node removeDuplicates(Node head) {
        Node st = head ;
        Node en = head ;
        while(en != null){
            if(st.data != en.data){
                st.next = en ;
                en.prev = st ;
                st = en ;
            }
            en = en.next ;
        }
        st.next = en ;
        return head ;
    }
}
