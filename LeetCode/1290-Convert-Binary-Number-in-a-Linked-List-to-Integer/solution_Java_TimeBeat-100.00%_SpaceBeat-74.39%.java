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
    public int getDecimalValue(ListNode head) {
        ListNode temp = null;
        ListNode curr = head;

        while(head!=null){
            head = curr.next;
            curr.next=temp;
            temp=curr;
            curr=head;
        }

        int val = 0;
        int p = 1;


        while(temp!=null){
            val = val + p*temp.val;
            p=p*2;
            temp=temp.next;
        }

        return val;

        
    }
}