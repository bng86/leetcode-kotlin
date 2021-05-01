package tw.andyang.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

class LC561Test {

    @Test
    fun arrayPairSum() {
        val target = LC561()
        assertEquals(4, target.arrayPairSum(intArrayOf(1, 4, 3, 2)))
        assertEquals(9, target.arrayPairSum(intArrayOf(6, 2, 6, 5, 1, 2)))
    }
}