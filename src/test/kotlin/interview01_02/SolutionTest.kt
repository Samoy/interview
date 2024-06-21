package interview01_02

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {

    @Test
    fun checkPermutation() {
        assertTrue(Solution().CheckPermutation("abc", "bca"))
        assertFalse(Solution().CheckPermutation("abc", "bad"))
    }
}