class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0)
        dummy.next = head

        prev = dummy
        current = head

        while current:
            while current.next and current.val == current.next.val:
                current = current.next

            if prev.next == current:
                prev = current
            else:
                prev.next = current.next

            current = current.next

        return dummy.next