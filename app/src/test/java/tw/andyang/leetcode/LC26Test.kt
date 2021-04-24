package tw.andyang.leetcode

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test

class LC26Test {

    @Test
    fun removeDuplicates() {
        val target = LC26()
        val numbers = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        assertEquals(5, target.removeDuplicates(numbers))
        assertArrayEquals(intArrayOf(0, 1, 2, 3, 4), numbers.take(5).toIntArray())
    }
}