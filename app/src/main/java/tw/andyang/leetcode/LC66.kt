package tw.andyang.leetcode

/**
 * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * Constraints:
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 */
class LC66 {

    fun plusOne(digits: IntArray): IntArray {
        // 最後一位不用進位直接 + 1 輸出
        if (digits.last() != 9) {
            val digit = digits.last()
            digits[digits.lastIndex] = digit + 1
            return digits
        } else {
            var carry: Boolean
            // 數學加法從最後一位開始計算需不需要進位
            for (i in digits.lastIndex downTo 0) {
                val digit = digits[i]
                if (digit == 9) {
                    digits[i] = 0
                    // 需要進位，該位進位為 0
                    carry = true
                    if (i == 0) { // 這邊是第一個數字需要原本空見不夠進位了，要進位複製到新的 array
                        val newList = digits.toMutableList()
                        newList.add(0, 1)
                        return newList.toIntArray()
                    }
                } else {
                    digits[i] = digit + 1
                    // 不需要進位，直接加 1
                    carry = false
                }
                // 不需要進位了提早 break
                if (!carry) {
                    break
                }
            }
            return digits
        }
    }
}