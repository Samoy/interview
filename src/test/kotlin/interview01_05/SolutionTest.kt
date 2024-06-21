package interview01_05

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {

    @Test
    fun oneEditAway() {
        assertTrue(Solution().oneEditAway("pale", "ple"))
        assertFalse(Solution().oneEditAway("pales", "pal"))
        assertTrue(Solution().oneEditAway("", "a"))
    }
}