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
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        int len=0;
        while(temp!=null)
        {
            temp=temp.next;
            len++;
        }

        ListNode temp1=head;

        if(len>=2)
        {
            if(len%2==1)
            len-=1;
            for(int i=0;i<len;i+=2)
            {
                ListNode temp2=temp1.next;
                int tempVal=temp2.val;
                temp2.val=temp1.val;
                temp1.val=tempVal;
                temp1=temp1.next.next;
            }

        }

        return head;
    }
}