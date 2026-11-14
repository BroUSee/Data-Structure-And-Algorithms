class Solution {
    public List<List<Integer>> displayList(Node head) {
        List<List<Integer>> ans = new LinkedList<>();
        ans.add(new LinkedList<>());
        ans.add(new LinkedList<>());
        Node temp = head ;
        while(temp.next != null){
            ans.get(0).add(temp.data);
            temp = temp.next ;
        }
        ans.get(0).add(temp.data);
        
        while(temp != null){
            ans.get(1).add(temp.data);
            temp = temp.prev;
        }
        return ans ;
    }
}
