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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> seen = new HashSet<>();
        ListNode curr = head;
        boolean result = false;

        while(curr != null){
            if(seen.contains(curr)){
                result = true;
                return result;
            }
            seen.add(curr);
            curr = curr.next;
        }
        return result;
    }
}
