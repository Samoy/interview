package interview01_07

/**
 * 给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。
 * 请你设计一种算法，将图像旋转 90 度。
 * 不占用额外内存空间能否做到？
 */
class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        val length = matrix.size
        // 水平翻转
        for (i in 0 until length / 2) {
            for (j in matrix[i].indices) {
                val tmp = matrix[i][j]
                matrix[i][j] = matrix[length - i - 1][j]
                matrix[length - i - 1][j] = tmp
            }
        }
        // 主对角线翻转
        for (i in matrix.indices) {
            for (j in 0 until i) {
                val tmp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = tmp
            }
        }
    }
}