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
    public ListNode mergeKLists(ListNode[] lists) {

        ListNode ans = new ListNode();
        ListNode curr = ans;
        int len = 0;
        int n = lists.length;

        for(int i=0;i<n;i++){

            ListNode temp = lists[i];
            while(temp!=null){
                temp=temp.next;
                len++;
            }
        }


        while(len!=0){
            int idx = -1;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(lists[i]!=null && lists[i].val<min){
                    min=lists[i].val;
                    idx=i;
                }
            }
            curr.next=lists[idx];
            curr=curr.next;
            lists[idx]=lists[idx].next;
            len--;
        }

        return ans.next;



    }
}