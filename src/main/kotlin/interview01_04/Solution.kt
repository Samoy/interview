package interview01_04

/**
 * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
 *
 * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
 *
 * 回文串不一定是字典当中的单词。
 */
class Solution {
    fun canPermutePalindrome(s: String): Boolean {
        // 回文串至多有一位出现次数是奇数，其余出现次数是偶数。
        // 使用set维护字符出现的个数，如果集合中不存在，则添加到集合中，
        // 否则从集合中删除。最后如果集合的数目小于等于1，则说明是回文排列。
        val set = HashSet<Char>()
        for (c in s) {
            if (set.contains(c)) {
                set.remove(c)
            } else {
                set.add(c)
            }
        }
        return set.size <= 1
    }
}