package tw.andyang.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

class LC287Test {

    @Test
    fun findDuplicate() {
        val target = LC287()
        assertEquals(2, target.findDuplicate(intArrayOf(1, 3, 4, 2, 2)))
        assertEquals(3, target.findDuplicate(intArrayOf(3, 1, 3, 4, 2)))
        assertEquals(1, target.findDuplicate(intArrayOf(1, 1)))
        assertEquals(1, target.findDuplicate(intArrayOf(1, 1, 2)))
    }
}