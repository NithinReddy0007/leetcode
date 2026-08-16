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
    public ListNode removeElements(ListNode head, int val) {
        while(head == null || head.val == val) {
            if(head == null) return head;
            head=head.next;
        }
        ListNode curr1 = head;
        ListNode curr2 = head.next;

        while(curr2!=null){
            if(curr2.val == val){
                curr2 = curr2.next;
                curr1.next = curr2;
            } else {
                curr2=curr2.next;
                curr1=curr1.next;
            }
        }

        return head;
        
        
    }
}