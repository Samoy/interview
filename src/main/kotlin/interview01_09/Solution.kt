package interview01_09

/**
 * 字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。
 *
 */
class Solution {
    fun isFlipedString(s1: String, s2: String): Boolean {
        return s1.length == s2.length && (s1 + s1).contains(s2)
    }
}