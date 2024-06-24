package interview01_08

/**
 * 编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。
 */
class Solution {
    fun setZeroes(matrix: Array<IntArray>) {
        val m = matrix.size
        val n = matrix[0].size
        val posList = ArrayList<Pair<Int, Int>>()
        // 找到原数组中为0的元素
        for (i in matrix.indices) {
            for (j in matrix[i].indices) {
                if (matrix[i][j] == 0) {
                    posList.add(Pair(i, j))
                }
            }
        }
        // 储存已消费的横坐标和纵坐标
        val xArray = ArrayList<Int>()
        val yArray = ArrayList<Int>()
        for (pos in posList) {
            // 替换行
            if (pos.first !in xArray) {
                for (i in 0 until n) {
                    matrix[pos.first][i] = 0
                }
                xArray.add(pos.first)
            }
            // 替换列
            if (pos.second !in yArray) {
                for (i in 0 until m) {
                    matrix[i][pos.second] = 0
                }
                yArray.add(pos.second)
            }
        }
    }
}