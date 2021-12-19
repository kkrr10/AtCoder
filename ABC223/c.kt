fun main() {
    val n = readLine()!!.toInt()
    val ab = Array(n) { readLine()!!.split(" ").map { it.toDouble() } }
    var restTime = ab.map { it[0] / it[1] }.sum() / 2
    var ans = 0.0
    ab.forEach {
        ans += minOf(it[0], restTime * it[1])
        restTime -= minOf(it[0] / it[1], restTime)
    }
    println(ans)
}
