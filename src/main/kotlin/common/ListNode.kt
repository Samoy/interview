package common

class ListNode(var `val`: Int, var next: ListNode? = null) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ListNode) return false
        var currentThis: ListNode? = this
        var currentOther: ListNode? = other
        while (currentThis != null) {
            if (currentThis.`val` != currentOther?.`val`) return false
            currentThis = currentThis.next
            currentOther = currentOther.next
        }
        return currentOther == null
    }

    override fun hashCode(): Int {
        var result = `val`
        var current = next
        while (current != null) {
            result = 31 * result + current.`val`
            current = current.next
        }
        return result
    }
}