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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<ListNode> que = new ArrayDeque<>();
        ListNode head2 = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next=head2;
            head2=curr;
            curr=temp;
        }

        curr=head2;
        while(curr!=null){
            while(!que.isEmpty() && que.peek().val<=curr.val) que.pop();
            if(que.isEmpty()) list.add(0);
            else list.add(que.peek().val);
            que.push(curr);
            curr=curr.next;
        }

        int[] ans = new int[list.size()];
        for(int i=list.size()-1;i>=0;i--){
            ans[i]=list.get(list.size()-i-1);
        }
        return ans;
    }
}