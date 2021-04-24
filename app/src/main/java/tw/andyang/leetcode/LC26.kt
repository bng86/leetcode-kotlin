package tw.andyang.leetcode

/** ref: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * 26. Remove Duplicates from Sorted Array
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * Clarification:
 * Confused why the returned value is an integer but your answer is an array?
 * Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.
 * Internally you can think of this:
 * nums is passed in by reference. (i.e., without making a copy)
 * int len = removeDuplicates(nums);
 * any modification to nums in your function would be known by the caller.
 * using the length returned by your function, it prints the first len elements.
 * for (int i = 0; i < len; i++) {
 *  print(nums[i]);
 * }
 * Constraints:
 * 0 <= nums.length <= 3 * 104
 * -104 <= nums[i] <= 104
 * nums is sorted in ascending order.
 */
class LC26 {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var temp = nums[0]
        var switchIndex = 1
        for (i in 0..nums.lastIndex) {
            if (temp != nums[i]) {
                temp = nums[i]
                nums[switchIndex] = temp
                switchIndex += 1
            }
        }
        return switchIndex
    }
}