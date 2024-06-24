package interview02_02

import common.ListNode

/**
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 *
 */
class Solution {
    fun kthToLast(head: ListNode?, k: Int): Int {
        var pre = head
        var cur = head
        for (i in 0 until k) {
            cur = cur?.next
        }
        while (cur != null) {
            pre = pre?.next
            cur = cur.next
        }
        return pre!!.`val`
    }
}