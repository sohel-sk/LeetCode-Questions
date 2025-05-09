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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode val = new ListNode(0);
        val.next = head;

        ListNode curr = val;

        while(curr.next != null && curr.next.next != null){     
            if(curr.next.val == curr.next.next.val) {
                int duplicate = curr.next.val;
                while(curr.next !=null && curr.next.val == duplicate) {
                    curr.next = curr.next.next;
                }
            }
            else curr = curr.next;
        }
        return val.next;       
    }
}