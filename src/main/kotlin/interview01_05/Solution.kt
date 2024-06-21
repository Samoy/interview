package interview01_05

import kotlin.math.abs

/**
 * 字符串有三种编辑操作:插入一个英文字符、删除一个英文字符或者替换一个英文字符。
 * 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。
 */
class Solution {
    fun oneEditAway(first: String, second: String): Boolean {
        if (first == second) return true
        val len1 = first.length
        val len2 = second.length
        if (abs(len1 - len2) > 1) return false
        // 如果第一个字符串比第二个字符串长度短，则尝试插入
        if (len1 < len2) {
            var newSecond = second
            for (i in 0 until len2) {
                if (i >= len1 || first[i] != second[i]) {
                    newSecond = newSecond.removeRange(IntRange(i, i))
                    return newSecond == first
                }
            }
        }
        // 如果第一个字符串和第二个字符串长度相等，则尝试替换
        else if (len1 == len2) {
            var cnt = 0
            for (i in first.indices) {
                val a = first[i]
                val b = second[i]
                if (a != b) {
                    cnt++
                }
            }
            return cnt <= 1
        }
        // 如果第一个字符串比第二个字符串长度长，则尝试删除
        else {
            var newFirst = first
            for (i in 0 until len1) {
                if (i >= len2 || first[i] != second[i]) {
                    newFirst = newFirst.removeRange(IntRange(i, i))
                    return newFirst == second
                }
            }
        }
        return false
    }
}