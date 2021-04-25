package tw.andyang.leetcode

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class LC242Test {

    @Test
    fun isAnagram() {
        val target = LC242()
        assertTrue(target.isAnagram("anagram", "nagaram"))
        assertFalse(target.isAnagram("rat", "car"))
    }
}