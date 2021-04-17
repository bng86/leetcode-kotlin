package tw.andyang.leetcode

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class LC66Test {

    @Test
    fun plusOne() {
        val target = LC66()
        assertArrayEquals(target.plusOne(intArrayOf(1, 2, 3)), intArrayOf(1, 2, 4))
        assertArrayEquals(target.plusOne(intArrayOf(4, 3, 2, 1)), intArrayOf(4, 3, 2, 2))
        assertArrayEquals(target.plusOne(intArrayOf(0)), intArrayOf(1))
        assertArrayEquals(target.plusOne(intArrayOf(9)), intArrayOf(1, 0))
        assertArrayEquals(target.plusOne(intArrayOf(9, 9)), intArrayOf(1, 0, 0))
        assertArrayEquals(
            target.plusOne(intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)),
            intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 1)
        )
    }
}