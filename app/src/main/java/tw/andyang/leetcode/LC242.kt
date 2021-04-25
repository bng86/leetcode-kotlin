package tw.andyang.leetcode

/**
 * ref: https://leetcode.com/problems/valid-anagram/
 * 242. Valid Anagram
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * Constraints:
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 */
class LC242 {
    fun isAnagram(s: String, t: String): Boolean {
        // all lowercase letters [a-z]
        val asciiA = 'a'.toInt()
        // 26 個字母查表只要 26 個位置
        val mapArray = IntArray(26) { 0 }
        // 出現過的 + 1
        s.forEach { c ->
            val index = c.toInt() - asciiA
            mapArray[index] += 1
        }
        // 出現過的 - 1
        t.forEach { c ->
            val index = c.toInt() - asciiA
            mapArray[index] -= 1
        }
        // 總和為 0 則兩邊出現的字元總數相同
        return mapArray.all { it == 0 }
    }
}