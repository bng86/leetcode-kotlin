package tw.andyang.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

class LC33Test {

    @Test
    fun search() {
        val target = LC33()
        assertEquals(4, target.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0))
        assertEquals(-1, target.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3))
        assertEquals(-1, target.search(intArrayOf(1), 0))
        assertEquals(0, target.search(intArrayOf(1), 1))
        assertEquals(0, target.search(intArrayOf(1, 3), 1))
        assertEquals(1, target.search(intArrayOf(3, 1), 1))
        assertEquals(1, target.search(intArrayOf(5, 1, 3), 1))
        assertEquals(0, target.search(intArrayOf(3, 1), 3))
        assertEquals(-1, target.search(intArrayOf(3, 1), 0))
    }
}