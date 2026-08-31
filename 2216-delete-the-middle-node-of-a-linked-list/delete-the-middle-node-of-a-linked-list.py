class Solution:
    def deleteMiddle(self, head):
        dummy = ListNode(0, head)

        slow = dummy
        fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        slow.next = slow.next.next

        return dummy.next