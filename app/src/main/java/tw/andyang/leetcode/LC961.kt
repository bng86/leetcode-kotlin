package tw.andyang.leetcode

/**
 * ref: https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 * 961. N-Repeated Element in Size 2N Array
 * In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
 * Return the element repeated N times.
 * Note:
 * 4 <= A.length <= 10000
 * 0 <= A[i] < 10000
 * A.length is even
 */
class LC961 {
    fun repeatedNTimes(input: IntArray): Int {
        val mapArray = IntArray(10000) { 0 }
        var result = 0
        for (i in 0..input.lastIndex) {
            mapArray[input[i]] += 1
            if (mapArray[input[i]] > 1) {
                result = input[i]
                break
            }
        }
        return result
    }
}