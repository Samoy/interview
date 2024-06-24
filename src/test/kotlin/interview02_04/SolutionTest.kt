package interview02_04

import common.ListNode
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {

    @Test
    fun partition() {
        assertEquals(
            ListNode(1, ListNode(2, ListNode(2, ListNode(4, ListNode(3, ListNode(5)))))), Solution().partition(
                ListNode(1, ListNode(4, ListNode(3, ListNode(2, ListNode(5, ListNode(2)))))), 3
            )
        )
        assertEquals(ListNode(1, ListNode(2)), Solution().partition(ListNode(2, ListNode(1)), 2))
    }
}