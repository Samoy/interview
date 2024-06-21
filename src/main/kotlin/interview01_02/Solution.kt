package interview01_02

/**
 * 给定两个由小写字母组成的字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，
 * 能否变成另一个字符串。
 */
class Solution {
    fun CheckPermutation(s1: String, s2: String): Boolean {
        if (s1.length != s2.length) return false
        val map = HashMap<Char, Int>()
        for (s in s1) {
            map[s] = map.getOrDefault(s, 0) + 1
        }
        for (s in s2) {
            if (map.containsKey(s)) {
                map[s] = map[s]!! - 1
                if (map[s]!! < 0) {
                    return false
                }
            } else {
                return false
            }
        }
        return true
    }
}