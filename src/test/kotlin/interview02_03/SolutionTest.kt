package interview02_03

import common.ListNode
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun deleteNode() {
        val tail = ListNode(9)
        val tail1 = ListNode(1, tail)
        val tail2 = ListNode(5, tail1)
        val head = ListNode(4, tail2)
        Solution().deleteNode(tail2)
        assertEquals(ListNode(4, ListNode(1, ListNode(9))), head)
    }
}