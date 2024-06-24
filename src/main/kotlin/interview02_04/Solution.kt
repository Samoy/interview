package interview02_04

import common.ListNode

/**
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 *
 * 你不需要 保留 每个分区中各节点的初始相对位置。
 */
class Solution {
    fun partition(head: ListNode?, x: Int): ListNode? {
        var less: ListNode? = ListNode(-1)
        val lessHead = less
        var greater: ListNode? = ListNode(-1)
        val greaterHead = greater
        var current = head
        while (current != null) {
            if (current.`val` < x) {
                less?.next = current
                less = less?.next
            } else {
                greater?.next = current
                greater = greater?.next
            }
            current = current.next
        }
        greater?.next = null
        less?.next = greaterHead?.next
        return lessHead?.next
    }
}