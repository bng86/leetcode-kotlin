package tw.andyang.leetcode

/**
 * Given an array of integers numbers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 *
 * Constraints:
 * 2 <= numbers.length <= 3 * 10^4
 * -1000 <= numbers[i] <= 1000
 * numbers is sorted in increasing order.
 * -1000 <= target <= 1000
 * Only one valid answer exists.
 */
class LC167 {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        // 標記出現過的數字
        val markedMap = hashMapOf<Int, Int>()
        // 儲存結果的 int array
        val result = IntArray(2)
        numbers.forEachIndexed { index, number ->
            // 預期要找到的配對數字
            val excepted = target - number
            // index 依題目需求要 + 1
            val numberIndex = index + 1
            // 到 hash map 裡找看數字出現了沒
            val exceptedIndex = markedMap[excepted]
            if (exceptedIndex == null) {
                // 找不到配對把自己存起來
                markedMap[number] = numberIndex
            } else {
                // 找到配對，再依據 index 大小來輸出
                if (numberIndex > exceptedIndex) {
                    result[1] = numberIndex
                    result[0] = exceptedIndex
                } else {
                    result[0] = numberIndex
                    result[1] = exceptedIndex
                }
            }
        }
        return result
    }
}