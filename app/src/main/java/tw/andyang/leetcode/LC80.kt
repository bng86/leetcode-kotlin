package tw.andyang.leetcode

/**
 * ref: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * 80. Remove Duplicates from Sorted Array II
 *
 * Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.
 * Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Clarification:
 * Confused why the returned value is an integer, but your answer is an array?
 * Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller.
 * Internally you can think of this:
 *
 * Constraints:
 * 1 <= nums.length <= 3 * 104
 * -104 <= nums[i] <= 104
 * nums is sorted in ascending order.

 */
class LC80 {
    fun removeDuplicates(nums: IntArray): Int {
        var fast = 1
        var slow = 0
        var times = 1
        while (fast < nums.size) {
            if (nums[slow] != nums[fast]) {
                slow += 1
                nums[slow] = nums[fast]
                times = 1
            } else {
                if (times < 2) {
                    slow += 1
                    nums[slow] = nums[fast]
                    times++
                }
            }
            fast += 1
        }

        return slow + 1
    }
}