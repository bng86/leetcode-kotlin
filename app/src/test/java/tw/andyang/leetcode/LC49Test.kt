package tw.andyang.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

class LC49Test {

    @Test
    fun groupAnagrams() {
        val target = LC49()
        assertEquals(
            listOf(listOf("eat", "tea", "ate"), listOf("bat"), listOf("tan", "nat")),
            target.groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
        )
        assertEquals(
            listOf(listOf("")),
            target.groupAnagrams(arrayOf(""))
        )
        assertEquals(
            listOf(listOf("a")),
            target.groupAnagrams(arrayOf("a"))
        )
    }
}