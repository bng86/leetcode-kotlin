package tw.andyang.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

class LC852Test {

    @Test
    fun peakIndexInMountainArray() {
        val target = LC852()
        assertEquals(1, target.peakIndexInMountainArray(intArrayOf(0, 1, 0)))
        assertEquals(1, target.peakIndexInMountainArray(intArrayOf(0, 2, 1, 0)))
        assertEquals(1, target.peakIndexInMountainArray(intArrayOf(0, 10, 5, 2)))
        assertEquals(2, target.peakIndexInMountainArray(intArrayOf(3, 4, 5, 1)))
        assertEquals(
            2,
            target.peakIndexInMountainArray(
                intArrayOf(
                    24, 69, 100, 99, 79,
                    78, 67, 36, 26, 19
                )
            )
        )
    }
}