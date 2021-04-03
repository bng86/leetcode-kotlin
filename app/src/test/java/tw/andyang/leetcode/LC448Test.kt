package tw.andyang.leetcode

import org.junit.Assert.*
import org.junit.Test

class LC448Test {

    @Test
    fun findDisappearedNumbers() {
        val target = LC448()
        val actual = target.findDisappearedNumbers(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1))
        assertArrayEquals(intArrayOf(5, 6), actual)
    }
}