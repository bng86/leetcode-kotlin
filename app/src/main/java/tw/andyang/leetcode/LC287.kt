package tw.andyang.leetcode

/**
 * ref: https://leetcode.com/problems/find-the-duplicate-number/
 * 287. Find the Duplicate Number
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * There is only one repeated number in nums, return this repeated number.
 * Constraints:
 * 2 <= n <= 3 * 104
 * nums.length == n + 1
 * 1 <= nums[i] <= n
 * All the integers in nums appear only once except for precisely one integer which appears two or more times.
 */
class LC287 {
    fun findDuplicate(nums: IntArray): Int {
        val mapArray = IntArray(nums.size + 1) { 0 }
        var result = 0
        for (it in nums) {
            mapArray[it] += 1
            if (mapArray[it] > 1) {
                result = it
                break
            }
        }
        return result
    }
}