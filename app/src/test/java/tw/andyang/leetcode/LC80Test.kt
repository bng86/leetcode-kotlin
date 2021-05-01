package tw.andyang.leetcode

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test

class LC80Test {

    @Test
    fun removeDuplicates() {
        val target = LC80()
        val inputs = intArrayOf(1, 1, 1, 2, 2, 3)
        assertEquals(5, target.removeDuplicates(inputs))
        assertArrayEquals(intArrayOf(1, 1, 2, 2, 3), inputs.take(5).toIntArray())
    }

    @Test
    fun removeDuplicates1() {
        val target = LC80()
        val inputs = intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3)
        assertEquals(7, target.removeDuplicates(inputs))
        assertArrayEquals(intArrayOf(0, 0, 1, 1, 2, 3, 3), inputs.take(7).toIntArray())
    }
}