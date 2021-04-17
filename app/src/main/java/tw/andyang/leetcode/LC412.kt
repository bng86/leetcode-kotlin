package tw.andyang.leetcode

/**
 * Given an integer n, return a string array answer (1-indexed) where:
 *
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i if non of the above conditions are true.
 *
 * Constraints: 1 <= n <= 104
 */
class LC412 {
    fun fizzBuzz(n: Int): List<String> {
        return (1..n).map { i ->
            when {
                i % 15 == 0-> "FizzBuzz"
                i % 3 == 0 -> "Fizz"
                i % 5 == 0 -> "Buzz"
                else -> "$i"
            }
        }
    }
}