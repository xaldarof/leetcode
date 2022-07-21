
class reverse {
    fun reverseWords(s: String): String {
        val buffer = StringBuffer()
        val splitted = s.split(" ")

        println(splitted)

        splitted.forEach {
            buffer.append(" ${ it.reversed()}")
        }
        return buffer.toString().trim()
    }
}

fun main() {
    println(reverse().reverseWords("Let's take LeetCode contest"))
}