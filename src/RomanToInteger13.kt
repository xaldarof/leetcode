

class RomanToInteger13 {

    fun romanToInt(s: String): Int {
        val numbersMap = HashMap<Char, Int>()
        numbersMap['I'] = 1
        numbersMap['V'] = 5
        numbersMap['X'] = 10
        numbersMap['L'] = 50
        numbersMap['C'] = 100
        numbersMap['D'] = 500
        numbersMap['M'] = 1000

        var result = 0;

        s.forEachIndexed { index, c ->
            val ch = s[index]
            result += if (index > 0 && numbersMap[ch]!! > numbersMap[s[index - 1]]!!) {
                numbersMap[ch]!! - 2 * numbersMap[s[index - 1]]!!
            } else
                numbersMap[ch]!!

        }

        return result
    }
}
