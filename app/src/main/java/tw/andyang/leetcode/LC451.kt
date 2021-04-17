package tw.andyang.leetcode

class LC451 {
    fun frequencySort(input: String): String {
        val map = mutableMapOf<Char, Int>()
        input.forEach { c ->
            val times = map[c] ?: 0
            map[c] = times + 1
        }
        var reuslt = ""
        map.toList().sortedByDescending { it.second }
            .forEach { (c, times) ->
                reuslt += timesChar(c, times)
            }

        return reuslt
    }

    private fun timesChar(char: Char, times: Int): String {
        var result = ""
        for (i in 0 until times) {
            result += char
        }
        return result
    }
}