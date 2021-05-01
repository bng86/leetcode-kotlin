package tw.andyang.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

class LC136Test {

    @Test
    fun singleNumber() {
        val target = LC136()
        assertEquals(1, target.singleNumber(intArrayOf(2, 2, 1)))
        assertEquals(4, target.singleNumber(intArrayOf(4, 1, 2, 1, 2)))
        assertEquals(1, target.singleNumber(intArrayOf(1)))
    }
}