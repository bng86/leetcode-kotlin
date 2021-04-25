package tw.andyang.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

class LC961Test {

    @Test
    fun repeatedNTimes() {
        val target = LC961()
        assertEquals(3, target.repeatedNTimes(intArrayOf(1, 2, 3, 3)))
        assertEquals(2, target.repeatedNTimes(intArrayOf(2, 1, 2, 5, 3, 2)))
        assertEquals(5, target.repeatedNTimes(intArrayOf(5, 1, 5, 2, 5, 3, 5, 4)))
    }
}