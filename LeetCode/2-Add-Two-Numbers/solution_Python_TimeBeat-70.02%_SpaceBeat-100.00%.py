# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def check(self,p):
        dummy=ListNode
        curr=dummy
        for el in p:
            curr.next=ListNode(int(el))
            curr=curr.next
        return dummy.next


    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        x=""
        curr=l1
        while curr:
            x=str(curr.val)+x
            curr=curr.next
        curr=l2
        y=""
        while curr:
            y=str(curr.val)+y
            curr=curr.next
        p=str(int(x)+int(y))
        p=p[::-1]
        head=self.check(p)
        return head

        
        

        
        