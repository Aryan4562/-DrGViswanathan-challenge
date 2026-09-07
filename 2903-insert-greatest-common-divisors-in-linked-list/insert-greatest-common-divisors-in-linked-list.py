from math import gcd

class Solution:
    def insertGreatestCommonDivisors(self, head):
        curr = head

        while curr.next:
            next_node = curr.next

            g = gcd(curr.val, next_node.val)

            new_node = ListNode(g)

            curr.next = new_node
            new_node.next = next_node

            curr = next_node

        return head