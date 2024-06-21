package interview01_01

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {

    @Test
    fun isUnique() {
        assertFalse(Solution().isUnique("leetcode"))
        assertTrue(Solution().isUnique("abc"))
    }
}