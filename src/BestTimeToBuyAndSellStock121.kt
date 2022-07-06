/**
 * Runtime: 942 ms, faster than 32.85% of Kotlin online submissions for Best Time to Buy and Sell Stock.
 * Memory Usage: 98.5 MB, less than 26.37% of Kotlin online submissions for Best Time to Buy and Sell Stock.
 */

class BestTimeToBuyAndSellStock121 {
    fun maxProfit(prices: IntArray): Int {

        var buy = prices[0]
        var maxProfit = 0
        for (i in 1 until prices.size) {

            if (buy > prices[i]) {

                buy = prices[i]

            } else if (prices[i] - buy > maxProfit) {
                maxProfit = prices[i] - buy
            }
        }
        return maxProfit
    }
}

fun main() {
    isPalindrome("A man, a plan, a canal: Panama")
}
fun isPalindrome(s: String): Boolean {
    val builder = StringBuilder(s)

    val str1 = builder.reverse().toString().toLowerCase().filter { it.isLetterOrDigit() }
    val str2 = s.toLowerCase().filter { it.isLetterOrDigit() }

    println(str1)
    println(str2)

    return str1 == str2
}