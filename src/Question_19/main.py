# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head, n):
        p = head
        pre = head
        while n > 0:
            if p is not None:
                p = p.next
                n -= 1
        if p is None:
            return head.next
        while p.next is not None:
            pre = pre.next
            p = p.next
        pre.next = pre.next.next
        return head


