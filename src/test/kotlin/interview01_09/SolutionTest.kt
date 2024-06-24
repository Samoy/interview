package interview01_09

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {

    @Test
    fun isFlipedString() {
        assertTrue(Solution().isFlipedString("waterbottle", "erbottlewat"))
        assertFalse(Solution().isFlipedString("aa", "aba"))
        assertFalse(Solution().isFlipedString("leetcode", ""))
    }
}