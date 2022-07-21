import java.math.BigInteger

class AddStrings {
    fun addStrings(num1: String, num2: String): String {
        val a = BigInteger(num1)
        val b = BigInteger(num2)
        return  (a.plus(b)).toString()
    }
}