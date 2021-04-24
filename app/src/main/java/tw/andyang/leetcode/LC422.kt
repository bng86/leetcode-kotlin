package tw.andyang.leetcode

import kotlin.math.abs

/**
 * ref: https://leetcode.com/problems/find-all-duplicates-in-an-array/
 * 442. Find All Duplicates in an Array
 * Given an integer array nums of length n where all the integers of nums are in the range [1, n]
 * and each integer appears once or twice, return an array of all the integers that appears twice.
 * Constraints:
 * n == nums.length
 * 1 <= n <= 105
 * 1 <= nums[i] <= n
 * Each element in nums appears once or twice.
 * Follow up: Could you do it without extra space and in O(n) runtime?
 */
class LC422 {
    fun findDuplicates(nums: IntArray): List<Int> {
        // 用來儲存結果
        val result = arrayListOf<Int>()
        for (i in 0..nums.lastIndex) {
            // 用負數標記出現過
            val index = abs(nums[i]) - 1
            // 該位置小於 0 代表出現過
            if (nums[index] < 0) {
                // 把該數值存下來 value = index + 1
                result.add(index + 1)
            } else {
                nums[index] *= -1
            }
        }
        return result
    }
}