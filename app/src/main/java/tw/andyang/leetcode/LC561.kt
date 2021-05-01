package tw.andyang.leetcode

/**
 * ref: https://leetcode.com/problems/array-partition-i/
 * 561. Array Partition I
 * Given an integer array nums of 2n integers,
 * group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn)
 * such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
 *
 * Constraints:
 * 1 <= n <= 104
 * nums.length == 2 * n
 * -104 <= nums[i] <= 104
 */
class LC561 {
    fun arrayPairSum(nums: IntArray): Int {
        // 先排序 n log n
        nums.sort()
        // 2 個 1 組，取第一個 = min
        // 最後再加總
        return nums.toList()
            .chunked(2)
            .map { pair -> pair.first() }
            .sum()
    }
}