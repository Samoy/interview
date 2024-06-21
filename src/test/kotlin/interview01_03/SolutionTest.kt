package interview01_03

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {

    @Test
    fun replaceSpaces() {
        assertEquals("Mr%20John%20Smith", Solution().replaceSpaces("Mr John Smith    ", 13))
        assertEquals("%20%20%20%20%20", Solution().replaceSpaces("               ", 5))
    }
}