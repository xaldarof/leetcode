
class IsPalindromeString {
    fun isPalindrome(s: String): Boolean {
        val builder = StringBuilder(s)

        val str1 = builder.reverse().toString().toLowerCase().filter { it.isLetterOrDigit() }
        val str2 = s.toLowerCase().filter { it.isLetterOrDigit() }


        return str1 == str2

    }
}