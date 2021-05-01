package tw.andyang.leetcode

/**
 * ref:
 * 136. Single Number
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
 *
 * Constraints:
 * 1 <= nums.length <= 3 * 104
 * -3 * 104 <= nums[i] <= 3 * 104
 * Each element in the array appears twice except for one element which appears only once.
 */
class LC136 {
    fun singleNumber(nums: IntArray): Int {
        var ans = 0
        // 0 跟任何數字 xor 為該數字
        // 任意數字 xor 自己為 0 -> 意即成對的數字 xor 後為 0
        // 最後 xor 後得數字即為不成對的數字
        nums.forEach {
            ans = ans xor it
        }
        return ans
    }
}