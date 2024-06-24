package interview02_01

import common.ListNode
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {

    @Test
    fun removeDuplicateNodes() {
        assertEquals(
            ListNode(1, ListNode(2, ListNode(3))), Solution().removeDuplicateNodes(
                ListNode(
                    1,
                    ListNode(2, ListNode(3, ListNode(3, ListNode(2, ListNode(2)))))
                )
            )
        )
        assertEquals(
            ListNode(1, ListNode(2)),
            Solution().removeDuplicateNodes(ListNode(1, ListNode(1, ListNode(1, ListNode(1, ListNode(2))))))
        )
    }
}