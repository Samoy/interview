package interview01_06

/**
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
 * 比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。
 * 你可以假设字符串中只包含大小写英文字母（a至z）。
 */
class Solution {
    fun compressString(S: String): String {
        if (S.length <= 2) return S
        val sb = StringBuilder()
        var prev: Char = S[0]
        var cnt = 1
        for (i in 1 until S.length) {
            val c = S[i]
            if (c != prev) {
                sb.append("$prev$cnt")
                prev = c
                cnt = 1
            } else {
                cnt++
            }
        }
        sb.append("$prev$cnt")
        return if (sb.length < S.length) sb.toString() else S
    }
}