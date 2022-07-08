class ReverseBits190 {
    fun reverseBits(n: Int): Int {
        var result = 0
        var mask = 1
        for (i in 0..31) {
            val digit = n and mask
            result = result shl 1
            if (digit != 0) {
                result += 1
            }
            mask = mask shl 1
        }
        return result
    }
}