package interview02_02

import common.ListNode
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {

    @Test
    fun kthToLast() {
        assertEquals(4, Solution().kthToLast(ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5))))), 2))
    }
}