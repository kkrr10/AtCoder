fun main() {
    val n = readLine()!!.toInt()
    for (bit in 0 until (1 shl n)) {
        var sum = 0
        for (i in n - 1 downTo 0) {
            sum += if ((bit shr i) and 1 == 0) 1 else -1
            if (sum < 0) break
        }
        if (sum == 0) {
            for (i in n - 1 downTo 0) print(if ((bit shr i) and 1 == 0) '(' else ')')
            println()
        }
    }
}
