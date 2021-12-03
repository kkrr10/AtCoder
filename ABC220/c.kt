fun main() {
    val n = readLine()!!.toLong()
    val a = readLine()!!.split(" ").map { it.toLong() }
    val x = readLine()!!.toLong()
    val aSum = a.sum()
    var current = x / aSum * aSum
    for ((i, v) in a.withIndex()) {
        current += v
        if (current > x) {
            println(x / aSum * n + i + 1)
            return
        }
    }
}
