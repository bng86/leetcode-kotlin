package tw.andyang.leetcode

class LC448 {
    fun findDisappearedNumbers(nums: IntArray): IntArray {

        fun markIndex(value: Int) {
            if (value == -1) return
            val index = value - 1
            val targetValue = nums[index]
            if (targetValue != -1) {
                nums[index] = -1
                markIndex(targetValue)
            }
        }

        nums.forEach { i ->
            markIndex(i)
        }

        val result = mutableListOf<Int>()
        nums.forEachIndexed { index, i ->
            if (i != -1) {
                result += index + 1
            }
        }

        return result.toIntArray()
    }

}