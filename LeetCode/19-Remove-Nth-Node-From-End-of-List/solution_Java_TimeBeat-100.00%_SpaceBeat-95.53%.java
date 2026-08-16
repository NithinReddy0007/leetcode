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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int len = 0;

        while (curr!=null){
            len+=1;
            curr = curr.next;
        }

        int i=1;
        n = len-n;
        curr=head;

        if(n==0) return head.next;

        while(i!=n){
            curr=curr.next;
            i++;
        }
        curr.next = curr.next.next;
        return head;
        
    }
}