package tw.andyang.leetcode

/**
 * ref: https://leetcode.com/problems/reverse-string/
 * 344. Reverse String
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * Constraints:
 * 1 <= s.length <= 105
 * s[i] is a printable ascii character.
 */
class LC344 {
    fun reverseString(s: CharArray) {
        val mid = (s.size / 2) - 1
        if (mid < 0) return
        var lastIndex = s.lastIndex
        for (i in 0..mid) {
            val temp = s[i]
            s[i] = s[lastIndex]
            s[lastIndex] = temp
            lastIndex -= 1
        }
    }
}