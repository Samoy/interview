package interview01_07

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun rotate() {
        val matrix1: Array<IntArray> = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9),
        )
        Solution().rotate(matrix1)
        assertArrayEquals(
            arrayOf(
                intArrayOf(7, 4, 1),
                intArrayOf(8, 5, 2),
                intArrayOf(9, 6, 3),
            ), matrix1
        )
        val matrix2: Array<IntArray> = arrayOf(
            intArrayOf(5, 1, 9, 11),
            intArrayOf(2, 4, 8, 10),
            intArrayOf(13, 3, 6, 7),
            intArrayOf(15, 14, 12, 16),
        )
        Solution().rotate(matrix2)
        assertArrayEquals(
            arrayOf(
                intArrayOf(15, 13, 2, 5),
                intArrayOf(14, 3, 4, 1),
                intArrayOf(12, 6, 8, 9),
                intArrayOf(16, 7, 10, 11)
            ), matrix2
        )
    }
}