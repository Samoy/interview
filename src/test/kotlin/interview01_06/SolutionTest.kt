package interview01_06

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {

    @Test
    fun compressString() {
        assertEquals("a2b1c5a3", Solution().compressString("aabcccccaaa"))
        assertEquals("abbccd", Solution().compressString("abbccd"))
    }
}