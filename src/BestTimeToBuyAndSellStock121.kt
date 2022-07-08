

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
