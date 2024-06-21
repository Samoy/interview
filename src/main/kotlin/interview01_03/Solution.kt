package interview01_03

/**
 * URL化。编写一种方法，将字符串中的空格全部替换为%20。
 * 假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。
 */
class Solution {
    fun replaceSpaces(S: String, length: Int): String {
        val sb = StringBuilder()
        for (i in 0 until length) {
            val char = S[i]
            if (char == ' ') {
                sb.append("%20")
            } else {
                sb.append(char)
            }
        }
        return sb.toString()
    }
}
