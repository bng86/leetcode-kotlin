package tw.andyang.leetcode

/**
 * Let's call an array arr a mountain if the following properties hold:
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... arr[i-1] < arr[i]
 * arr[i] > arr[i+1] > ... > arr[arr.length - 1]
 * Given an integer array arr that is guaranteed to be a mountain, return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
 * Constraints:
 * 3 <= arr.length <= 104
 * 0 <= arr[i] <= 106
 * arr is guaranteed to be a mountain array.
 */
class LC852 {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        // 解法一：暴力解，先跑一輪找到最大的數字 O(N)
        // 解法二：已知有一個最高點，可以用二分法找到他
        var left = 0
        var right = arr.lastIndex
        while (left < right) {
            val mid = (left + right) / 2
            if (arr[mid] > arr[mid + 1]) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return right
    }
}