package tw.andyang.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

class LC422Test {

    @Test
    fun findDuplicates() {
        val target = LC422()
        assertEquals(listOf(2, 3), target.findDuplicates(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)))
        assertEquals(listOf(1), target.findDuplicates(intArrayOf(1, 1, 2)))
        assertEquals(emptyList<Int>(), target.findDuplicates(intArrayOf(1)))
    }
}