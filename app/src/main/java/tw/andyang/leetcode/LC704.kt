package tw.andyang.leetcode

/**
 * ref: https://leetcode.com/problems/binary-search/
 * 704. Binary Search
 * Given an array of integers nums which is sorted in ascending order,
 * and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 *
 * Constraints:
 * 1 <= nums.length <= 104
 * -9999 <= nums[i], target <= 9999
 * All the integers in nums are unique.
 * nums is sorted in an ascending order.
 */
class LC704 {
    fun search(nums: IntArray, target: Int): Int {
        // test case 1.
        // -1, 0, 3, 5, 9, 12, size = 6, target = 9
        // mid = 2 left = 0 right = 5, value = 3,
        // 9 > 3 left = mid + 1 = 3, right = 5, mid = 4, value = 9
        // 9 == 9 left = right, ans = 4

        // test case 2. not exist
        // -1, 0, 3, 5, 9, 12, size = 6, target = 2
        // mid = 2, left = 0, right = 5, value = 3
        // 2 < 3, left = 0, right = mid - 1 = 1, value = 0
        // 2 > 0, left = mid + 1 = 1, right = 1, value =0
        // left == right not exist

        // edge case only one value early return
        if (nums.size == 1) {
            return if (nums[0] == target) {
                0
            } else {
                -1
            }
        }

        var left = 0
        var right = nums.lastIndex
        var ans = -1
        while (left <= right) {
            val mid = (left + right) / 2
            val value = nums[mid]
            when {
                target == value -> {
                    left = right + 1
                    ans = mid
                }
                target > value -> left = mid + 1
                else -> right = mid - 1
            }
        }

        return ans
    }
}