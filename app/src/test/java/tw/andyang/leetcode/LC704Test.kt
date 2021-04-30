package tw.andyang.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

class LC704Test {

    @Test
    fun search() {
        val target = LC704()
        assertEquals(4, target.search(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
        assertEquals(-1, target.search(intArrayOf(-1, 0, 3, 5, 9, 12), 2))
        assertEquals(1, target.search(intArrayOf(2, 5), 5))
    }
}