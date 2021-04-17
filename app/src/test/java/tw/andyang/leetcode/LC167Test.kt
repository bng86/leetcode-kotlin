package tw.andyang.leetcode

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class LC167Test {

    @Test
    fun twoSum() {
        val target = LC167()
        assertArrayEquals(target.twoSum(intArrayOf(2, 7, 11, 15), 9), intArrayOf(1, 2))
        assertArrayEquals(target.twoSum(intArrayOf(2, 3, 4), 6), intArrayOf(1, 3))
        assertArrayEquals(target.twoSum(intArrayOf(-1, 0), -1), intArrayOf(1, 2))
    }
}