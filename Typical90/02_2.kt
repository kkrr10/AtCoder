fun main() {
    val n = readLine()!!.toInt()
    for (bit in 0 until (1 shl n)) {
        var line = ""
        var sum = 0
        for (i in n - 1 downTo 0) {
            sum += if ((bit shr i) and 1 == 0) {
                line = "${line}("
                1
            } else {
                line = "${line})"
                -1
            }
            if (sum < 0) break
        }
        if (sum == 0) println(line)
    }
}
