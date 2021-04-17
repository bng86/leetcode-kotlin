package tw.andyang.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

class LC451Test {

    @Test
    fun frequencySort() {
        val target = LC451()
        val actual = target.frequencySort("tree")
        assertEquals("eetr", actual)
    }
}