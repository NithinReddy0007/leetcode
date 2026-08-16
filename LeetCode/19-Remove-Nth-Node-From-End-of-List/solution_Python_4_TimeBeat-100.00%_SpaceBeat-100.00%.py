# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        curr=head
        k=0
        while curr:
            k+=1
            curr=curr.next
        if k==n:
            head=head.next
            return head
        else:
            curr=head
            for i in range (k-n-1):
                curr=curr.next
            curr.next=curr.next.next
            return head
            

        

        