package interview02_01

import common.ListNode

/**
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 */
class Solution {
    fun removeDuplicateNodes(head: ListNode?): ListNode? {
        var ob = head
        while (ob != null) {
            var oc = ob
            while (oc?.next != null) {
                if (oc.next?.`val` == ob.`val`) {
                    oc.next = oc.next?.next
                } else {
                    oc = oc.next
                }
            }
            ob = ob.next
        }
        return head
    }
}