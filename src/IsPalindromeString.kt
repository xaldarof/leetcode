/*
Runtime: 337 ms, faster than 54.47% of Kotlin online submissions for Valid Palindrome.
Memory Usage: 42.9 MB, less than 29.61% of Kotlin online submissions for Valid Palindrome.
 */

class IsPalindromeString {
    fun isPalindrome(s: String): Boolean {
        val builder = StringBuilder(s)

        val str1 = builder.reverse().toString().toLowerCase().filter { it.isLetterOrDigit() }
        val str2 = s.toLowerCase().filter { it.isLetterOrDigit() }


        return str1 == str2

    }
}