package tw.andyang.leetcode

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class LC344Test {

    @Test
    fun reverseString() {
        val target = LC344()
        val input = charArrayOf('h', 'e', 'l', 'l', 'o')
        target.reverseString(input)
        assertArrayEquals(input, charArrayOf('o', 'l', 'l', 'e', 'h'))
    }
}