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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode p1 = head,p2 = head;
        ListNode start = head,end = head;
        for(int i=1;i<k;i++){
            p2 = p2.next;
        }

        start = p2;
        while(p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        end = p1;
        int t = start.val;
        start.val = end.val;
        end.val = t;
        return head;
    }
}