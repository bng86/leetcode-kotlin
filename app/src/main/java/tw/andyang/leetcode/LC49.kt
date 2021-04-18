package tw.andyang.leetcode

/**
 * 49. Group Anagrams ref: https://leetcode.com/problems/group-anagrams/
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 * Constraints:
 * 1 <= strs.length <= 104
 * 0 <= strs[i].length <= 100
 * strs[i] consists of lower-case English letters.
 */
class LC49 {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        if (strs.size == 1) {
            return listOf(strs.toList())
        } else {
            val map = hashMapOf<String, List<String>>()
            strs.forEach { str ->
                // 把字串作為 hash 的 key 使用，先排序字串，相同組合排序會相同
                // 排序 O(n log n)
                val sortedString = str.toCharArray().sorted().joinToString("")
                // 到 hash map 裡找看有沒有出現過，沒有就放到籃子內
                if (map[sortedString] == null) {
                    map[sortedString] = listOf(str)
                } else {
                    map[sortedString] = map[sortedString]!!.toMutableList().apply {
                        add(str)
                    }
                }
            }
            val result = mutableListOf<List<String>>()
            // 把 hash map 的結果輸出
            map.forEach { (_, v) ->
                result.add(v)
            }
            return result
        }
    }
}