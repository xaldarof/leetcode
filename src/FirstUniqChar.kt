class FirstUniqChar {
    fun firstUniqChar(s: String): Int {
        val map = mutableMapOf<String,CharCount>()

        s.forEach {
            if (map.containsKey(it.toString())) {
                val pair = map[it.toString()]
                pair!!.count++
                map[it.toString()] = pair
            } else {
                map[it.toString()] = CharCount(it.toString(),1)
            }
        }

        var uniqIndex = -1
        map.keys.forEachIndexed { index, str ->
            if(map[str]?.count == 1 && uniqIndex == -1) {
                uniqIndex = index
            }
        }

        return uniqIndex
    }

    data class CharCount(var string: String,var count:Int)
}

fun main() {
    println(FirstUniqChar().firstUniqChar("dddccdbba"))
}