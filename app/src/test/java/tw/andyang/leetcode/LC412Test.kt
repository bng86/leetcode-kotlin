package tw.andyang.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

class LC412Test {

    @Test
    fun fizzBuzz() {
        val target = LC412()
        assertEquals(listOf("1", "2", "Fizz"), target.fizzBuzz(3))
        assertEquals(listOf("1","2","Fizz","4","Buzz"), target.fizzBuzz(5))
        assertEquals(listOf("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"), target.fizzBuzz(15))
    }
}