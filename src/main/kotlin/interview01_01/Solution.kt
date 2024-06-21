package interview01_01

/**
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 */
class Solution {
    fun isUnique(astr: String): Boolean {
        var mask = 0
        for (char in astr) {
            val moveBit = char - '0'
            if (mask and (1 shl moveBit) != 0) {
                return false
            } else {
                mask = mask or (1 shl moveBit)
            }
        }
        return true
    }
}