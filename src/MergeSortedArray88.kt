class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        val map = hashMapOf<Int,Int>()

        nums.forEach {
            map[it] = it
        }

        return map.keys.size != nums.size
    }
}

fun main() {
    print(ContainsDuplicate().containsDuplicate(intArrayOf(1,2,3,2)))
}