package tw.andyang.leetcode

/**
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 * Given the array nums after the rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 *
 * Constraints:
 * 1 <= nums.length <= 5000
 * -104 <= nums[i] <= 104
 * All values of nums are unique.
 * nums is guaranteed to be rotated at some pivot.
 * -104 <= target <= 104
 * O(log n)
 */
class LC33 {
    fun search(nums: IntArray, target: Int): Int {
        // edge case 只有一個數字直接比較不用跑搜尋
        if (nums.size == 1) {
            return if (nums[0] == target) {
                0
            } else {
                -1
            }
        }

        // 找出 rotate 的位置 k
        val k: Int = findPivot(nums)
        var left = 0
        var right = nums.lastIndex
        if (target >= nums[k] && target <= nums[nums.lastIndex]) {
            // 找 pivot 右邊的數列
            left = k
            right = nums.lastIndex
        } else {
            // 找 pivot 左邊的數列
            left = 0
            right = k - 1
        }

        // 如果只有一組數字，直接跟 target 比較
        if (left == right && target == nums[right]) {
            return right
        }

        // O(log n) 透過 binary search 找到 target
        while (right >= left) {
            val mid = (left + right) / 2
            when {
                // mid 剛好是 target 直接 break
                target == nums[mid] -> return mid
                target > nums[mid] -> left = mid + 1
                else -> right = mid - 1
            }
        }
        return -1
    }

    // O(log n)
    private fun findPivot(nums: IntArray): Int {
        var left = 0
        var right = nums.lastIndex
        while (right > left) {
            val mid = (left + right) / 2
            // 看右邊那組是不是連續數列
            if (nums[mid] < nums[right]) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return right
    }
}